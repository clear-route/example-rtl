const jestOpenAPI = require('jest-openapi').default;
const path = require('path')
const axios = require('axios')
jestOpenAPI(`${path.resolve(__dirname)}/../open-api-spec.yml`);

describe('Post /api/user/create', () => {
  it('should satisfy OpenAPI spec for create user', async () => {
    const res = await axios.post(
        'http://localhost:8080/api/user/create', 
        {
          username: `${new Date().getTime()}@user.com`,
          password: 'some password',
          tcno: Math.random().toString().slice(2,13)
        });

    expect(res.status).toEqual(200);
    expect(res).toSatisfyApiSpec();
  });
});
