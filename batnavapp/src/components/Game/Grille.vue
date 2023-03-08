<template>
  <div>
    <table class="plateau">
      <tr v-for="i in 10" :key="i">
        <th v-for="j in 10" :key="j">
          <CaseComponent
            class="case"
            :id="plateau.cases[(i-1)*10 + j-1].id"
            :image="plateau.cases[(i-1)*10 + j-1].image"
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
  props:{
   prev: Boolean
  },

  data() {
    return {
      plateau: {
        cases: []
      },
    };
  },

  created() {
    for (let i = 0; i < 100; i++){
      this.plateau.cases[i] = {id: i, image: "", state:0}
    }
  },
  methods: {

    
    traiteClick(idCase) {
      console.log(this.plateau.cases[idCase].id);
    },

    previsualiserBateau(idCase, state) {
      console.log("prévi", idCase, this.prev);
      if (this.prev == true){
        for (let i = idCase; i<idCase +3; i++) {
        this.plateau.cases[i].image = state
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
