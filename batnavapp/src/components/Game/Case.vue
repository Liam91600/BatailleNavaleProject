<template>
  <img
    :src="require('@/assets/' + imageurl)"
    @click="clickMe"
    @contextmenu.prevent="rightClick"
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
const url_prev = "texture_sea_prev.jpg";

export default {
  name: "CaseComponent",
  props: {
    id: Number,
    type: String,
    is_prev: Boolean,
  },

  computed: {
    imageurl: function () {
      if (this.type != "") {
        return url_ship;
      } else if (this.is_prev == true) {
        return url_prev;
      }
      return url_sea;
    },
  },

  methods: {
    clickMe() {
      this.$emit("clickCase", this.id);
    },
    prev() {
      this.$emit("prev", this.id, true);
    },
    unprev() {
      this.$emit("prev", this.id, false);
    },
    rightClick() {
      this.$emit("prev", this.id, false);
      if (this.$store.getters.getOrientation == "Horizontal") {
        this.$store.commit("setOrientation", "Vertical");
      } else {
        this.$store.commit("setOrientation", "Horizontal");
      }
    },
  },
};
</script>
