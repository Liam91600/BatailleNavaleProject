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

  props: {
    nom_prev: String,
    taille_prev: Number,
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
        for (let i = idCase; i < idCase + this.taille_prev; i++) {
          this.plateau.cases[i].type = this.nom_prev;
        }
        this.$emit("click_unprev", 0, "");
      }
    },

    prev(idCase, mouse) {
      console.log("prev", idCase, this.nom_prev);
      if (this.nom_prev != "" && this.plateau.cases[idCase].type == "") {
        for (let i = idCase; i < idCase + this.taille_prev; i++) {
          this.plateau.cases[i].is_prev = mouse;
        }
      }
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
