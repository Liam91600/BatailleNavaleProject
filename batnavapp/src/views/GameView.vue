<template>
  <NavigationBar />

  <div class="placementbateau">
    <PlacementBateau @click_prev="click_prev" />
  </div>
  <Grille
    :nom_prev="nom_prev"
    :taille_prev="taille_prev"
    @click_unprev="click_prev"
  />
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
      nom_prev: "",
      taille_prev: 0,
    };
  },

  methods: {
    click_prev(taille, nom) {
      this.nom_prev = nom;
      this.taille_prev = taille;
      console.log(this.nom_prev, this.taille_prev);
    },
  },
};
</script>
<style>
.placementbateau {
  display: flex;
  margin: 100px 100px;
}
</style>
