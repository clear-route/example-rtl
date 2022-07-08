import http from 'k6/http';
import { sleep } from 'k6';

export const options = {
  duration: '1m',
  vus: 50,
  thresholds: {
    http_req_duration: ['p(95)<1000'], // 95 percent of response times must be below 500ms
  },
};

export default function () {
  http.post('http://localhost:8080/api/user/create');
  sleep(1.5);
}