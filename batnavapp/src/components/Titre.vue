<template>
  <div class="titre">
    <p>{{ msg }}</p>
  </div>
</template>

<script>
export default {
  name: "TitrePage",
  props: {
    msg: String,
  },
};
</script>

<style>
.titre {
  margin: 13vh auto;
  font-size: 50px;
  text-shadow: 0 0 2px #00fffc, 0 0 30px #00fffc, 0px 0px 5px #00fffc,
    0 0 150px #00fffc;
  color: #00fffc;
}
</style>
