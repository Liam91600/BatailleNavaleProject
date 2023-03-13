<template>
  <NavigationBar />

  <div class="placementbateau" >
    <PlacementBateau @click_prev="click_prev"/>
  </div>
  <Grille :prev="prev" :taille="taille_prev" @click="place"/>
</template>

<script>
import NavigationBar from "@/components/Navigation/NavigationBar.vue";
import Grille from "@/components/Game/Grille.vue";
import PlacementBateau from "@/components/Game/PlacementBateau.vue";

export default {
  name: "GameView",
  components: {
    NavigationBar,
    Grille,
    PlacementBateau,
  },
  data() {
    return {
      prev:false,
      taille_prev:0,

    }
  },

  

  methods: {

    click_prev(taille){
      this.prev = true
      this.taille_prev= taille
      console.log(this.prev, this.taille)

    },

    place(){
      if (this.prev==true){this.prev=false; this.taille=0}
    }
    
  },
};
</script>
<style>
.placementbateau {
  display: flex;
  margin: 100px 100px;
}
</style>
