<template>
  <div>
    <table class="plateau">
      <tr v-for="i in 10" :key="i">
        <th v-for="j in 10" :key="j">
          <CaseComponent
            class="case"
            :id="plateau.cases[(i - 1) * 10 + j - 1].id"
            :type="plateau.cases[(i - 1) * 10 + j - 1].type"
            :is_prev="plateau.cases[(i - 1) * 10 + j - 1].is_prev"
            @clickCase="traiteClick"
            @prev="prev"
          />
        </th>
      </tr>
    </table>
  </div>
</template>

<script>
import CaseComponent from "@/components/Game/Case.vue";
export default {
  name: "GrilleComponent",
  components: {
    CaseComponent,
  },

  data() {
    return {
      plateau: {
        cases: [],
      },
    };
  },

  created() {
    for (let i = 0; i < 100; i++) {
      this.plateau.cases[i] = { id: i, type: "", is_prev: false };
    }
  },
  methods: {
    traiteClick(idCase) {
      console.log(
        "click",
        this.plateau.cases[idCase].id,
        this.plateau.cases[idCase].type
      );
      if (this.plateau.cases[idCase].is_prev == true) {
        if (this.$store.getters.getOrientation == "Horizontal") {
          for (
            let i = idCase;
            i < idCase + this.$store.getters.getTaillePrev;
            i++
          ) {
            this.plateau.cases[i].type = this.$store.getters.getNomPrev;
          }
        } else if (this.$store.getters.getOrientation == "Vertical") {
          for (
            let i = idCase;
            i < idCase + 10 * this.$store.getters.getTaillePrev;
            i = i + 10
          ) {
            this.plateau.cases[i].type = this.$store.getters.getNomPrev;
          }
        }

        this.$store.commit("setIsPrev", false);
        this.$store.commit("setTaillePrev", 0);
        this.$store.commit("setNomPrev", "");
      }
    },

    prev(idCase, mouse) {
      console.log("prev", idCase);
      if (this.$store.getters.getIsPrev == true) {
        if (
          this.$store.getters.getOrientation == "Horizontal" &&
          this.check_prev_horizontal(
            idCase,
            this.$store.getters.getTaillePrev
          ) &&
          Math.floor((idCase + this.$store.getters.getTaillePrev - 1) / 10) ==
            Math.floor(idCase / 10)
        ) {
          for (
            let i = idCase;
            i < idCase + this.$store.getters.getTaillePrev;
            i++
          ) {
            this.plateau.cases[i].is_prev = mouse;
          }
        } else if (
          this.$store.getters.getOrientation == "Vertical" &&
          this.check_prev_vertical(idCase, this.$store.getters.getTaillePrev) &&
          Math.floor(idCase / 10) + this.$store.getters.getTaillePrev <= 10
        ) {
          for (
            let i = idCase;
            i < idCase + 10 * this.$store.getters.getTaillePrev;
            i = i + 10
          ) {
            this.plateau.cases[i].is_prev = mouse;
          }
        }
      }
    },

    //vérifie si les n cases suivantes à celle survollée sont déja occupées par un bateau ou pas (check le type des cases)
    check_prev_horizontal(id, taille) {
      for (let i = id; i < id + taille; i++) {
        if (this.plateau.cases[i].type != "") {
          return false;
        }
      }
      return true;
    },
    check_prev_vertical(id, taille) {
      for (let i = id; i < id + 10 * taille; i = i + 10) {
        if (this.plateau.cases[i].type != "") {
          return false;
        }
      }
      return true;
    },
  },
};
</script>

<style scoped>
.plateau {
  margin: 100px 100px;
}
.case {
  height: 50px;
  width: 50px;
  border: 0.2px solid black;
}

th {
  padding: 0;
}
</style>
