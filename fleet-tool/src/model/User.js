import { EntitySchema } from "typeorm"

export const User = new EntitySchema({
  name: "User",
  target: User,
  columns: {
    id: {
      primary: true,
      type: "int",
      generated: true
    },
    name: {
      type: "varchar"
    }
  }
});
