import express from 'express';
import idController from "./controller/id_controller.js";

const router = express.Router();

router.get('/base/uuid', idController.getUUID);

export default router;
