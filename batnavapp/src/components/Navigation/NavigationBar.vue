<template>
  <!-- <nav>
    <h4>
      <Navigation nom="home" label="Home" />
      <span> - </span>
      <Navigation nom="lobby" label="Jouer" />
      <span> - </span>
      <Navigation nom="login" label="Quitter" />
    </h4>
  </nav> -->

  <nav class="navbar bg-body-tertiary">
    <div class="container">
      <a class="navbar-brand" href="#">
        <img src="@/assets/logonav.png" alt="logonav" width="30" height="24" />
        <Navigation nom="home" label="Home" />
        <Navigation nom="lobby" label="Jouer" />
        <Navigation nom="login" label="Quitter" />
      </a>
    </div>
  </nav>
</template>

<script>
import Navigation from "./Navigation.vue";

export default {
  name: "BarreNavigation",
  components: {
    Navigation,
  },
};
</script>
