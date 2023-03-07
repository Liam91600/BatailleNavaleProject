<template>
  <div>
    <table class="plateau">
      <tr v-for="(row, i) in plateau.case" :key="i">
        <th v-for="(item, j) in row" :key="j">
          <CaseComponent
            class="case"
            :id="item.id"
            :image="item.image"
            @clickCase="traiteClick"
            @previsualisation="previsualiserBateau"
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
        case: [],
      },
    };
  },

  created() {
    for (let i = 0; i < 10; i++) {
      this.plateau.case[i] = [];
      for (let j = 0; j < 10; j++) {
        this.plateau.case[i][j] = {
          id: (10 * i + j + 1).toString(),
          image: "",
          state: 0,
        };
      }
    }
  },
  methods: {
    traiteClick(idCase) {
      console.log(idCase);
    },
    previsualiserBateau(idCase, state) {
      console.log("prévi", idCase);
      this.plateau.case.forEach((row) => {
        row.forEach((cse) => {
          if (idCase == cse.id || cse.id == parseInt(idCase) + 1) {
            if (state == "in") {
              cse.image = "ship";
            }
            if (state == "out") {
              cse.image = "sea";
            }
          }
        });
      });
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
