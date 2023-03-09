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

      bateau: {
        taille: 0
      }
    }
  },

  mounted() {
    console.log("Appel service Rest");
    const APP_SERVER_URL = "http://127.0.0.1:8080/rest";

    let request = new Request(APP_SERVER_URL + "/bateau/" + "all", {
      method: "GET",
      headers: { "Content-Type": "application/json" },
    });
    fetch(request)
      .then((response) => {
        if (response.ok) {
          return response.json();
        }
      })
      .then((data) => {
        console.log(data);
        this.leschat = data;
      });
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
