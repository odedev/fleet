import Router from "@koa/router";

const router = new Router();

router.get('/v', async (ctx, next) => {
  // ctx.router available
  await ctx.render('index')
});

export default router;
