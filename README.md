
# Sample Java WebApp (Advanced)

This project demonstrates building a WAR inside a Maven Docker container via GitHub Actions, generating test reports, SBOM, optional Docker image packaging, and security scanning.

## Quick Start
1. Push this repository to GitHub.
2. Open **Actions** and run the workflow **manually** (no auto triggers).
3. Configure the workflow variables/secrets:
   - Edit `.github/workflows/maven-docker-manual.yml` and set `BRANCH_NAME` to your branch.
   - (Optional) Set repository variable `GHCR_IMAGE` like `ghcr.io/<org>/<repo>/sample-webapp`.
   - (Optional) Add secret `TEAMS_WEBHOOK_URL` for notifications.

## Build locally
```bash
mvn -B -ntp clean package
# Build container locally if desired
docker build -t sample-webapp:local .
docker run -p 8080:8080 sample-webapp:local
```

## Workflow Features
- Runs inside `maven:eclipse-temurin` container.
- Manual `workflow_dispatch` only.
- Caches `~/.m2` dependencies.
- JUnit + JaCoCo coverage, SpotBugs static analysis.
- CycloneDX SBOM generation.
- Optional Docker build & push to GHCR.
- Optional vulnerability scan via Trivy.
- Optional GitHub Release creation with WAR attached.
- Optional Teams notification.
