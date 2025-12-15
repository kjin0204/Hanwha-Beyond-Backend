import { createApp } from 'vue'
import App from './App.vue'
// import router from './router/01_router.js'
// import nesteRouter from './router/02_nestedRouter'
import indexRoutes from './router/index.routes.js'

/* npm install vue-router@next로 dependency 추가 */
const app = createApp(App);
// app.use(router);
// app.use(nesteRouter);
app.use(indexRoutes);
app.mount('#app');
