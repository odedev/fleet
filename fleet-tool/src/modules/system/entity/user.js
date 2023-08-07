import { EntitySchema } from "typeorm";


const User = new EntitySchema({
  name: 'user',
  tableName: 'user',
  columns: {
    id: {
      type: 'varchar',
      primary: true,
      generated: 'uuid',
    },

    username: {
      type: 'varchar',
      nullable: true,
      length: 255,
    },
    password: {
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
    },

    version: {
      version: true,
    },
    createdAt: {
      createDate: true
    },
    updatedAt: {
      updateDate: true
    },
    deletedAt: {
      deleteDate: true
    },
  },
  uniques: [],
  orderBy: {
    username: "ASC"
  }
});

export default User;
