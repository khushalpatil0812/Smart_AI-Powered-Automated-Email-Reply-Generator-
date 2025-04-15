

Smart_AI-Powered Automated Email Reply Generator with Chrome Extension

A smart AI assistant built to generate real-time, context-aware email replies right inside Gmail. 
This project combines full-stack development, AI integration, and Chrome Extension magic to create a productivity booster for anyone overwhelmed by their inbox.

Project Overview:
- Objective: Automatically generate personalized email replies using AI
- Delivery: Chrome Extension embedded in the Gmail UI
- AI: Powered by Google Gemini 2.0 Pro
- Tech Stack: Spring Boot (Backend), React + Vite (Frontend), Chrome Extension (UI Injection)

Key Features:
- Gmail Integration: Seamless Chrome Extension that hooks directly into your Gmail interface
- AI Reply Generation: Contextual, smart replies crafted using Gemini 2.0 Pro
- Full Stack Flow: Backend REST APIs manage AI prompts and logic; frontend offers a lightweight testing UI
- Testable Architecture: Modular code with frontend, backend, and extension working independently or together

Tech Stack:
- Backend: Spring Boot (REST APIs, AI business logic)
- Frontend: React + Vite (lightweight UI for testing & showcasing)
- AI Model: Google Gemini 2.0 Pro
- Chrome Extension: Injects suggestions into Gmail compose window

Development Tools:
- IntelliJ IDEA: Spring Boot backend development
- VS Code: Frontend and extension coding
- Postman: API testing
- Chrome: Extension testing and debugging

Project Structure:
- backend/       -> Spring Boot APIs
- frontend/      -> React + Vite UI
- extension/     -> Chrome Extension code
- README.md      -> You’re here!

Setup & Installation:

1. Clone the Repository:
   git clone 
   cd ai-reply-generator

2. Run the Backend (Spring Boot):
   cd backend
   ./mvnw spring-boot:run
   (Make sure your Gemini API keys are set in application.properties)

3. Run the Frontend (React + Vite):
   cd frontend
   npm install
   npm run dev

4. Load the Chrome Extension:
   - Open Chrome and go to chrome://extensions/
   - Enable Developer Mode
   - Click "Load unpacked"
   - Select the "extension/" folder
   - Open Gmail – the extension should activate automatically in the compose view

How to Use:
1. Open Gmail in Chrome
2. Click "Compose" or open a thread
3. The extension reads the current email content
4. AI-generated reply suggestions will appear inside the compose box
5. Click a suggestion to insert it directly

AI Integration Details:
- Model Used: Gemini 2.0 Pro from Google AI Studio
- Prompting: Crafted to reflect context, tone, and brevity
- API Connection: Backend handles secure requests to Gemini and relays the response

What I Learned:
- Building and deploying a functional Chrome Extension
- Full-stack integration between AI services and UIs
- Spring Boot for scalable API design
- React + Vite for fast frontend development
- Real-world prompt engineering with Gemini
- Managing communication between backend, frontend, extension, and AI

Why This Project?
I got tired of switching tools to write emails, so I built something smarter: a personal AI assistant that lives in Gmail. Fast, fun, and surprisingly effective — and now I spend less time typing and more time doing.
