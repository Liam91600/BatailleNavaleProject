<template>
  <NavigationBar />

  <div class="placementbateau">
    <PlacementBateau :prev="this.prev"/>
  </div>
  <Grille />
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
    }
  },

  created(){

    const source = new EventSource("@/components/Game/PlacementBateau.vue");
    source.addEventListener(
      "click_prev",
      function(){
        console.log("bien transmis")
        this.prev = true
        // if (this.prev==true){this.prev=false}
      }
    )
  },
};
</script>
<style>
.placementbateau {
  margin: 100px 100px;
}
</style>
