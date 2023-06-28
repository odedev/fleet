import express from 'express';
import system from "./system/router.js";

const router = express.Router();

router.use(system);

router.get('/', function(req, res, next) {
  res.render('index', { title: 'Fleet Tool' });
});

export default router;
