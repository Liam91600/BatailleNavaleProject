<template>
  <img
    :src="require('@/assets/' + imageurl)"
    @click="clickMe"
    @mouseover="prev"
    @mouseout="unprev"
    alt="Case de jeu"
    height="110"
    width="110"
  />
</template>

<script>
const url_sea = "texture_sea.jpg";
const url_ship = "texture_ship.jpg";
export default {
  name: "CaseComponent",
  props: {
    id: Number,
    image: String,
  },

  computed: {
    imageurl: function () {
      if (this.image == "sea") {
        return url_sea;
      }
      if (this.image == "ship") {
        return url_ship;
      }
      return url_sea;
    },
  },

  methods: {
    clickMe() {
      this.$emit("clickCase", this.id);
    },
    prev() {
      this.$emit("previsualisation", this.id, "ship");
    },
    unprev() {
      this.$emit("previsualisation", this.id, "sea");
    },
  },
};
</script>
