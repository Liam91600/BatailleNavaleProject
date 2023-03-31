<template>
  <NavigationBar />

  <div class="placementbateau">
    <PlacementBateau />
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
};
</script>
<style>
.placementbateau {
  display: flex;
  margin: 100px 100px;
}
</style>
