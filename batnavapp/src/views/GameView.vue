<template>
  <NavigationBar />

  <div class="placementbateau">
    <PlacementBateau @click="click_prev(5)"/>
    <PlacementBateau @click="click_prev(4)"/>
    <PlacementBateau @click="click_prev(3)"/>
  </div>
  <Grille :prev="prev" :taille="taille" @click="place"/>
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
      taille:0,
    }
  },

  methods: {

    click_prev(t){
      this.prev = true
      this.taille= t
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
