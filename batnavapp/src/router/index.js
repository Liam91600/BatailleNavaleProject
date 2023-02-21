import { createRouter, createWebHashHistory } from 'vue-router'
import LoginView from '../views/LoginView.vue'
import HomeView from '../views/HomeView.vue'
import LobbyView from '../views/LobbyView.vue'


const routes = [
  {
    path: '/',
    name: 'login',
    component: LoginView
  },
  {
    path: '/:lenom/home',
    name: 'home',
    component: HomeView
  },
  {
    path: '/:lenom/lobby',
    name: 'lobby',
    component: LobbyView
  },
  
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
