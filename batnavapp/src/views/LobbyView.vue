<template>
  <Titre msg="Lobby" />
  <NavigationBar></NavigationBar>

  <div class="canal">
    <Partie
      v-for="row in this.leschat"
      :key="row"
      :id="row.canalId"
      :name="row.canalName"
      :description="row.canalDescription"
    ></Partie>
  </div>
</template>

<script>
import NavigationBar from "@/components/Navigation/NavigationBar.vue";
import Partie from "@/components/Partie.vue";
import Titre from "@/components/Titre.vue";
export default {
  name: "LobbyView",
  components: {
    Titre,
    NavigationBar,
    Partie,
  },

  data() {
    return {
      leschat: {
        canalId: "",
        canalName: "",
        canalDescription: "",
      },
    };
  },

  mounted() {
    console.log("Appel service Rest");
    const APP_SERVER_URL = "http://127.0.0.1:8080/rest";

    let request = new Request(APP_SERVER_URL + "/chatcanal/" + "all", {
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
};
</script>

<style>
.canal {
  display: flex;
}
</style>
