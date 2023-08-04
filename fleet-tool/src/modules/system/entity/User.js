import { EntitySchema } from "typeorm";

const User = new EntitySchema({
  name: 'User',
  tableName: 'user',
  columns: {
    id: {
      type: 'varchar',
      primary: true,
      generated: 'uuid',
    },
    usernames: {
      type: 'varchar',
      nullable: true,
    },
    code: {
      type: 'varchar',
      nullable: true,
    },
    name: {
      type: 'varchar'
    },
    age: {
      type: 'int',
      nullable: true,
    }
  }
});

export default User;
