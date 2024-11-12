package com.compose.tugasfront_end.core.presentation

import com.compose.tugasfront_end.R
import com.compose.tugasfront_end.core.model.Category
import com.compose.tugasfront_end.core.model.Course
import com.compose.tugasfront_end.core.model.DetailSession
import com.compose.tugasfront_end.core.model.Session
import com.compose.tugasfront_end.core.model.Video
import kotlin.random.Random

object Utils {

    fun generateCourseDummy(): List<Course> {
        return listOf(
            Course(
                id = 1,
                name = "3D Design",
                description = "Learn the fundamentals of 3D modeling and design using industry-standard tools.",
                owner = "John Doe",
                date = "24 Nov 2024",
                image = R.drawable.image_class_3d_desain,
                rate = 4.5,
                reviewCount = 120,
                price = "$20.00"
            ),
            Course(
                id = 2,
                name = "Art",
                description = "A comprehensive course in classical and modern art techniques.",
                owner = "Jane Smith",
                date = "24 Nov 2024",
                image = R.drawable.image_class_art,
                rate = 4.2,
                reviewCount = 85,
                price = "$45.00"
            ),
            Course(
                id = 3,
                name = "Color Identity",
                description = "Explore how color affects design and user perception.",
                owner = "Alice Brown",
                date = "24 Nov 2024",
                image = R.drawable.image_class_color_identity,
                rate = 4.8,
                reviewCount = 200,
                price = "$30.00"
            ),
            Course(
                id = 4,
                name = "Design Testing",
                description = "Learn the best practices for testing designs to ensure usability and functionality.",
                owner = "Michael Green",
                date = "24 Nov 2024",
                image = R.drawable.image_class_design_testing,
                rate = 4.3,
                reviewCount = 150,
                price = "$40.50"
            ),
            Course(
                id = 5,
                name = "Motion Graphic",
                description = "Master the art of motion graphics using various animation techniques and tools.",
                owner = "Emily White",
                date = "24 Nov 2024",
                image = R.drawable.image_class_motion_graphic,
                rate = 4.7,
                reviewCount = 180,
                price = "$35.00"
            ),
            Course(
                id = 6,
                name = "Product Designer",
                description = "Learn product design principles, including user research, prototyping, and testing.",
                owner = "Chris Black",
                date = "24 Nov 2024",
                image = R.drawable.image_class_product_designer,
                rate = 4.6,
                reviewCount = 110,
                price = "$35.00"
            ),
            Course(
                id = 7,
                name = "Typography and Layout",
                description = "Discover the art of typography and creating effective layouts for web and print.",
                owner = "Sophia Turner",
                date = "24 Nov 2024",
                image = R.drawable.image_class_product_typography,
                rate = 4.4,
                reviewCount = 140,
                price = "$20.00"
            ),
            Course(
                id = 8,
                name = "Unity",
                description = "Learn game development with Unity, focusing on 2D and 3D game creation.",
                owner = "David Wilson",
                date = "24 Nov 2024",
                image = R.drawable.image_class_unity,
                rate = 4.9,
                reviewCount = 250,
                price = "$10.00"
            ),
            Course(
                id = 9,
                name = "Visual Identity",
                description = "Understand the role of visual identity in branding and its application in design.",
                owner = "Olivia Johnson",
                date = "24 Nov 2024",
                image = R.drawable.image_class_visual_identity,
                rate = 4.3,
                reviewCount = 95,
                price = "$24.00"
            ),
            Course(
                id = 10,
                name = "Work Life Balance",
                description = "Strategies and techniques for balancing work and personal life in a creative career.",
                owner = "James Lee",
                date = "24 Nov 2024",
                image = R.drawable.image_class_work_life_balance,
                rate = 4.1,
                reviewCount = 75,
                price = "$36.00"
            )
        )
    }

    fun generateCategoryList(): List<Category> {
        return listOf(
            Category(
                id = 1,
                name = "AI",
                image = R.drawable.image_category_ai,
                rate = 4.8f,
                review = 220,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to AI",
                        detail = listOf(
                            DetailSession("What is AI?", duration = 15, isPlayed = true),
                            DetailSession("History of AI", duration = 20, isPlayed = false),
                            DetailSession("Types of AI", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Machine Learning Basics",
                        detail = listOf(
                            DetailSession(
                                "Understanding Machine Learning",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Supervised Learning", duration = 30, isPlayed = false),
                            DetailSession("Unsupervised Learning", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Deep Learning",
                        detail = listOf(
                            DetailSession(
                                "Introduction to Neural Networks",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Training Neural Networks",
                                duration = 35,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Convolutional Neural Networks (CNN)",
                                duration = 40,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Natural Language Processing",
                        detail = listOf(
                            DetailSession("What is NLP?", duration = 20, isPlayed = false),
                            DetailSession("Text Preprocessing", duration = 25, isPlayed = false),
                            DetailSession("Sentiment Analysis", duration = 30, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "AI in Robotics",
                        detail = listOf(
                            DetailSession(
                                "AI in Autonomous Robots",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Robot Perception", duration = 30, isPlayed = false),
                            DetailSession("AI in Navigation", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "AI Ethics",
                        detail = listOf(
                            DetailSession(
                                "Ethical Considerations in AI",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession("AI Bias and Fairness", duration = 25, isPlayed = false),
                            DetailSession(
                                "The Future of AI Ethics",
                                duration = 30,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "AI Applications",
                        detail = listOf(
                            DetailSession("AI in Healthcare", duration = 25, isPlayed = false),
                            DetailSession("AI in Finance", duration = 30, isPlayed = false),
                            DetailSession("AI in Gaming", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "AI Algorithms",
                        detail = listOf(
                            DetailSession("Genetic Algorithms", duration = 30, isPlayed = false),
                            DetailSession(
                                "Reinforcement Learning",
                                duration = 35,
                                isPlayed = false
                            ),
                            DetailSession("Clustering Algorithms", duration = 40, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "AI Future Trends",
                        detail = listOf(
                            DetailSession(
                                "The Future of Artificial General Intelligence",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("AI in Everyday Life", duration = 30, isPlayed = false),
                            DetailSession("AI and Society", duration = 35, isPlayed = false)
                        )
                    )
                )
            ),
            Category(
                id = 2,
                name = "Plant",
                image = R.drawable.image_category_plant,
                rate = 4.7f,
                review = 180,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to Plants",
                        detail = listOf(
                            DetailSession("What Are Plants?", duration = 15, isPlayed = true),
                            DetailSession("Plant Classification", duration = 20, isPlayed = false),
                            DetailSession("Photosynthesis Process", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Plant Growth and Development",
                        detail = listOf(
                            DetailSession("How Plants Grow", duration = 25, isPlayed = false),
                            DetailSession(
                                "Factors Affecting Plant Growth",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Plant Hormones", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Plant Reproduction",
                        detail = listOf(
                            DetailSession("Types of Reproduction", duration = 30, isPlayed = false),
                            DetailSession(
                                "Sexual Reproduction in Plants",
                                duration = 35,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Asexual Reproduction in Plants",
                                duration = 40,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Plant Anatomy",
                        detail = listOf(
                            DetailSession(
                                "Roots, Stems, and Leaves",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Vascular Tissues in Plants",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Plant Cells and Tissues",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Plant Ecology",
                        detail = listOf(
                            DetailSession(
                                "Plant-Environment Interaction",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Ecosystem Role of Plants",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Plant Adaptations to Different Environments",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Plant Diseases",
                        detail = listOf(
                            DetailSession("Common Plant Diseases", duration = 20, isPlayed = false),
                            DetailSession(
                                "Symptoms and Treatment of Plant Diseases",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Preventive Measures for Plant Diseases",
                                duration = 30,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Plant Conservation",
                        detail = listOf(
                            DetailSession(
                                "Threats to Plant Biodiversity",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Conservation Techniques",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Global Plant Conservation Efforts",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Plant Biotechnology",
                        detail = listOf(
                            DetailSession(
                                "Introduction to Plant Biotechnology",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Genetically Modified Plants",
                                duration = 35,
                                isPlayed = false
                            ),
                            DetailSession("Plant Tissue Culture", duration = 40, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Plant in Human Life",
                        detail = listOf(
                            DetailSession("Plants in Medicine", duration = 25, isPlayed = false),
                            DetailSession(
                                "Culinary Uses of Plants",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Cultural Significance of Plants",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    )
                )
            ),
            Category(
                id = 3,
                name = "Fundamental",
                image = R.drawable.image_category_fundamental,
                rate = 4.5f,
                review = 250,
                totalLessons = 10, // Adjusted to 10 lessons
                session = listOf(
                    Session(
                        name = "Introduction to Fundamentals",
                        detail = listOf(
                            DetailSession("What is Fundamental?", duration = 15, isPlayed = false),
                            DetailSession(
                                "Key Concepts in Fundamentals",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession(
                                "The Importance of Fundamentals",
                                duration = 25,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Mathematical Foundations",
                        detail = listOf(
                            DetailSession("Basic Arithmetic", duration = 20, isPlayed = false),
                            DetailSession("Algebra Essentials", duration = 25, isPlayed = false),
                            DetailSession("Geometry Basics", duration = 30, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Critical Thinking",
                        detail = listOf(
                            DetailSession(
                                "What is Critical Thinking?",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Logical Reasoning", duration = 30, isPlayed = false),
                            DetailSession(
                                "Problem-Solving Techniques",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Introduction to Programming",
                        detail = listOf(
                            DetailSession(
                                "Basic Programming Concepts",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Writing Simple Code", duration = 35, isPlayed = false),
                            DetailSession(
                                "Variables and Data Types",
                                duration = 40,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Understanding Algorithms",
                        detail = listOf(
                            DetailSession("What Are Algorithms?", duration = 20, isPlayed = false),
                            DetailSession("Sorting Algorithms", duration = 25, isPlayed = false),
                            DetailSession("Searching Algorithms", duration = 30, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Basic Design Principles",
                        detail = listOf(
                            DetailSession(
                                "Principles of Good Design",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Design Thinking", duration = 30, isPlayed = false),
                            DetailSession("Color Theory", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Data Structures",
                        detail = listOf(
                            DetailSession("Arrays and Lists", duration = 25, isPlayed = false),
                            DetailSession("Stacks and Queues", duration = 30, isPlayed = false),
                            DetailSession("Trees and Graphs", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Networking Fundamentals",
                        detail = listOf(
                            DetailSession("Networking Basics", duration = 25, isPlayed = false),
                            DetailSession("Internet Protocols", duration = 30, isPlayed = false),
                            DetailSession(
                                "Security and Encryption",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Software Development Lifecycle",
                        detail = listOf(
                            DetailSession("Phases of Development", duration = 30, isPlayed = false),
                            DetailSession("Agile Methodology", duration = 35, isPlayed = false),
                            DetailSession("Version Control", duration = 40, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Introduction to Databases",
                        detail = listOf(
                            DetailSession("What is a Database?", duration = 20, isPlayed = false),
                            DetailSession("Relational Databases", duration = 25, isPlayed = false),
                            DetailSession("SQL Basics", duration = 30, isPlayed = false)
                        )
                    )
                )
            ),
            Category(
                id = 4,
                name = "Design Rules",
                image = R.drawable.image_category_art,
                rate = 4.8f,
                review = 200,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Fundamentals of Design",
                        detail = listOf(
                            DetailSession("Principles of Design", duration = 15, isPlayed = true),
                            DetailSession(
                                "Understanding Composition",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession("Contrast and Balance", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Color Theory",
                        detail = listOf(
                            DetailSession(
                                "Primary and Secondary Colors",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Complementary and Analogous Colors",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Using Color in Design", duration = 20, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Design for User Experience",
                        detail = listOf(
                            DetailSession("User-Centered Design", duration = 25, isPlayed = false),
                            DetailSession("Visual Hierarchy", duration = 30, isPlayed = false),
                            DetailSession(
                                "Design for Accessibility",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    )
                )
            ),
            Category(
                id = 10,
                name = "Design Tools",
                image = R.drawable.image_category_math,
                rate = 4.7f,
                review = 250,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Intro to Design Tools",
                        detail = listOf(
                            DetailSession(
                                "Overview of Design Software",
                                duration = 15,
                                isPlayed = true
                            ),
                            DetailSession(
                                "Choosing the Right Tool",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Design Tools for Beginners",
                                duration = 25,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Adobe Illustrator Basics",
                        detail = listOf(
                            DetailSession(
                                "Getting Started with Illustrator",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Creating Vector Graphics",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Working with Layers", duration = 20, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Figma for Design",
                        detail = listOf(
                            DetailSession(
                                "Using Figma for UI Design",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Collaborating in Figma",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Prototyping in Figma", duration = 20, isPlayed = false)
                        )
                    )
                )
            ),
            Category(
                id = 5,
                name = "Color Palette",
                image = R.drawable.image_category_health,
                rate = 4.9f,
                review = 310,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to Color Theory",
                        detail = listOf(
                            DetailSession(
                                "Understanding the Color Wheel",
                                duration = 15,
                                isPlayed = true
                            ),
                            DetailSession("Color Harmony", duration = 20, isPlayed = false),
                            DetailSession("Psychology of Colors", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Creating Color Palettes",
                        detail = listOf(
                            DetailSession(
                                "Choosing Complementary Colors",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Monochromatic Color Palettes",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Contrasting Colors", duration = 20, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Color Palettes for Branding",
                        detail = listOf(
                            DetailSession("Colors in Branding", duration = 25, isPlayed = false),
                            DetailSession(
                                "Selecting Colors for Logos",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Creating Color Consistency",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    )
                )
            ),
            Category(
                id = 6,
                name = "Design Principles",
                image = R.drawable.image_category_balance,
                rate = 4.7f,
                review = 180,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Principles of Design",
                        detail = listOf(
                            DetailSession("Balance in Design", duration = 15, isPlayed = true),
                            DetailSession("Contrast in Design", duration = 20, isPlayed = false),
                            DetailSession("Unity and Proximity", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Composition and Layout",
                        detail = listOf(
                            DetailSession("Rule of Thirds", duration = 25, isPlayed = false),
                            DetailSession("Grid Layouts", duration = 30, isPlayed = false),
                            DetailSession(
                                "Negative Space in Layouts",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Typography and Visual Hierarchy",
                        detail = listOf(
                            DetailSession(
                                "Using Typography for Emphasis",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Visual Hierarchy in Layout",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Effective Use of Typefaces",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    )
                )
            ),
            Category(
                id = 7,
                name = "Usability Testing",
                image = R.drawable.image_category_animation,
                rate = 4.8f,
                review = 150,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to Usability Testing",
                        detail = listOf(
                            DetailSession(
                                "What is Usability Testing?",
                                duration = 15,
                                isPlayed = true
                            ),
                            DetailSession(
                                "Usability Testing Process",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession("Test Planning", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Usability Testing Methods",
                        detail = listOf(
                            DetailSession(
                                "Conducting User Interviews",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Surveys and Questionnaires",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Observational Testing", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Analyzing Usability Results",
                        detail = listOf(
                            DetailSession("Analyzing Test Data", duration = 30, isPlayed = false),
                            DetailSession("Making Design Changes", duration = 25, isPlayed = false),
                            DetailSession("Reporting Results", duration = 20, isPlayed = false)
                        )
                    )
                )
            ),
            Category(
                id = 8,
                name = "Basic Graphic Design",
                image = R.drawable.image_category_branding,
                rate = 4.6f,
                review = 120,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to Graphic Design",
                        detail = listOf(
                            DetailSession(
                                "What is Graphic Design?",
                                duration = 15,
                                isPlayed = true
                            ),
                            DetailSession(
                                "Basic Design Principles",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Color Theory for Designers",
                                duration = 25,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Design Tools Overview",
                        detail = listOf(
                            DetailSession(
                                "Design Software Basics",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Using Adobe Illustrator",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Using Figma for UI", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Creating Simple Designs",
                        detail = listOf(
                            DetailSession("Creating Logos", duration = 25, isPlayed = false),
                            DetailSession("Basic Poster Design", duration = 30, isPlayed = false),
                            DetailSession("Creating Flyers", duration = 20, isPlayed = false)
                        )
                    )
                )
            ),
            Category(
                id = 9,
                name = "White Lettering",
                image = R.drawable.image_category_graphic_design,
                rate = 4.5f,
                review = 100,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to Lettering",
                        detail = listOf(
                            DetailSession("What is Lettering?", duration = 15, isPlayed = true),
                            DetailSession("Tools for Lettering", duration = 20, isPlayed = false),
                            DetailSession("Sketching Letterforms", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "White Lettering Techniques",
                        detail = listOf(
                            DetailSession(
                                "Creating White Lettering",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Layering Lettering", duration = 30, isPlayed = false),
                            DetailSession(
                                "Using White Space Effectively",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Advanced Lettering",
                        detail = listOf(
                            DetailSession("Lettering in Branding", duration = 30, isPlayed = false),
                            DetailSession(
                                "Typography and White Lettering",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Lettering for Digital Media",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    )
                )
            )
        )
    }

    fun generateVideoDummy(): List<Video> {
        return listOf(
            Video(
                id = 1,
                name = "Typography",
                image = R.drawable.image_video_typography,
                description = "Explore the world of Typography, covering font selection, spacing, and the impact of text on visual communication.",
                rate = 4.7,
                like = Random.nextInt(1, 100000),
                price = "$19.99",
                tone = R.drawable.icon_tone_1,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Typography Basics",
                        detail = listOf(
                            DetailSession(
                                "Introduction to Typography",
                                duration = 20,
                                isPlayed = true
                            ),
                            DetailSession(
                                "Choosing the Right Font",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Letter Spacing", duration = 20, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Advanced Typography",
                        detail = listOf(
                            DetailSession("Font Pairing", duration = 30, isPlayed = false),
                            DetailSession("Responsive Typography", duration = 35, isPlayed = false),
                            DetailSession("Typography in Branding", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Typography in Practice",
                        detail = listOf(
                            DetailSession(
                                "Practical Typography Tips",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Creating Typography for Web",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Typography and Readability",
                                duration = 30,
                                isPlayed = false
                            )
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 2,
                name = "White Space",
                image = R.drawable.image_video_white_space,
                description = "Learn the power of white space in design, enhancing readability and creating clean, professional layouts.",
                rate = 4.6,
                like = Random.nextInt(1, 100000),
                price = "$17.99",
                tone = R.drawable.icon_tone_2,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Understanding White Space",
                        detail = listOf(
                            DetailSession("What is White Space?", duration = 15, isPlayed = true),
                            DetailSession(
                                "Importance in Layout Design",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession("Types of White Space", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Applying White Space",
                        detail = listOf(
                            DetailSession(
                                "Using White Space Effectively",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Whitespace in User Interfaces",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Creating Clean Designs", duration = 30, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "White Space Challenges",
                        detail = listOf(
                            DetailSession("Overusing White Space", duration = 20, isPlayed = false),
                            DetailSession(
                                "Balancing Content and Space",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Whitespace and Visual Hierarchy",
                                duration = 30,
                                isPlayed = false
                            )
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 3,
                name = "Design Rules",
                image = R.drawable.image_video_design_rules,
                description = "Understand the fundamental design rules, including composition, contrast, and alignment to improve visual appeal.",
                rate = 4.8,
                like = Random.nextInt(1, 100000),
                price = "$18.99",
                tone = R.drawable.icon_tone_1,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Design Composition",
                        detail = listOf(
                            DetailSession("Understanding Balance", duration = 20, isPlayed = true),
                            DetailSession("Alignment in Design", duration = 25, isPlayed = false),
                            DetailSession("Rule of Thirds", duration = 20, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Color Theory in Design",
                        detail = listOf(
                            DetailSession("Color Wheel Basics", duration = 30, isPlayed = false),
                            DetailSession("Complementary Colors", duration = 35, isPlayed = false),
                            DetailSession(
                                "Color Contrast in Design",
                                duration = 25,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Typography and Layout",
                        detail = listOf(
                            DetailSession("Choosing Fonts", duration = 25, isPlayed = false),
                            DetailSession(
                                "Font Pairing and Readability",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Text Layout and Spacing",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 4,
                name = "Design Tools",
                image = R.drawable.image_video_design_tools,
                description = "Get familiar with essential design tools used by professionals, from Adobe Suite to Figma and Sketch.",
                rate = 4.7,
                like = Random.nextInt(1, 100000),
                price = "$22.99",
                tone = R.drawable.icon_tone_2,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to Design Tools",
                        detail = listOf(
                            DetailSession(
                                "Overview of Adobe Suite",
                                duration = 25,
                                isPlayed = true
                            ),
                            DetailSession(
                                "Using Figma for UI Design",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Sketch Overview", duration = 20, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Advanced Design Tools",
                        detail = listOf(
                            DetailSession(
                                "Illustrator for Vector Art",
                                duration = 35,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Photoshop for Image Editing",
                                duration = 40,
                                isPlayed = false
                            ),
                            DetailSession("Prototyping with Figma", duration = 45, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Collaborative Tools",
                        detail = listOf(
                            DetailSession(
                                "Design Collaboration in Figma",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Sharing Designs and Feedback",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Using Cloud Storage for Design Files",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 5,
                name = "Color Palette",
                image = R.drawable.image_video_color_palette,
                description = "Master the art of creating effective color palettes that elevate the mood and appeal of your designs.",
                rate = 4.9,
                like = Random.nextInt(1, 100000),
                price = "$20.99",
                tone = R.drawable.icon_tone_1,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to Color Theory",
                        detail = listOf(
                            DetailSession(
                                "Primary Colors and Their Combinations",
                                duration = 20,
                                isPlayed = true
                            ),
                            DetailSession("Color Psychology", duration = 25, isPlayed = false),
                            DetailSession(
                                "Understanding Warm and Cool Colors",
                                duration = 30,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Creating Color Palettes",
                        detail = listOf(
                            DetailSession(
                                "Using Online Tools for Color Palettes",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Monochromatic Palettes",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Complementary Color Palettes",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Applying Color in Design",
                        detail = listOf(
                            DetailSession("Color in Web Design", duration = 25, isPlayed = false),
                            DetailSession("Color in Print Design", duration = 30, isPlayed = false),
                            DetailSession(
                                "The Impact of Color on Branding",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 6,
                name = "Design Principles",
                image = R.drawable.image_video_design_principles,
                description = "Learn key design principles such as balance, contrast, and hierarchy to create visually engaging work.",
                rate = 4.7,
                like = Random.nextInt(1, 100000),
                price = "$21.99",
                tone = R.drawable.icon_tone_2,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Design Fundamentals",
                        detail = listOf(
                            DetailSession("Balance and Alignment", duration = 20, isPlayed = true),
                            DetailSession(
                                "Proximity and Alignment",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Repetition in Design", duration = 30, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Advanced Design Principles",
                        detail = listOf(
                            DetailSession(
                                "Contrast in Visual Design",
                                duration = 30,
                                isPlayed = true
                            ),
                            DetailSession("Hierarchy in Design", duration = 35, isPlayed = false),
                            DetailSession("Creating Visual Flow", duration = 40, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Implementing Design Principles",
                        detail = listOf(
                            DetailSession(
                                "Applying Principles in Web Design",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Implementing Design Rules in Branding",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "User-Centered Design Principles",
                                duration = 25,
                                isPlayed = false
                            )
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 7,
                name = "Usability Testing",
                image = R.drawable.image_video_usability_testing,
                description = "Dive into usability testing methods to ensure your designs provide a seamless user experience.",
                rate = 4.8,
                like = Random.nextInt(1, 100000),
                price = "$23.99",
                tone = R.drawable.icon_tone_1,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to Usability Testing",
                        detail = listOf(
                            DetailSession(
                                "What is Usability Testing?",
                                duration = 15,
                                isPlayed = true
                            ),
                            DetailSession(
                                "Usability Testing Process",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession("Test Planning", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Usability Testing Methods",
                        detail = listOf(
                            DetailSession(
                                "Conducting User Interviews",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Surveys and Questionnaires",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession("Observational Testing", duration = 35, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Analyzing Usability Results",
                        detail = listOf(
                            DetailSession("Analyzing Test Data", duration = 20, isPlayed = false),
                            DetailSession(
                                "Identifying Usability Issues",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Improving the Design", duration = 30, isPlayed = false)
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 8,
                name = "Basic Graphic Design",
                image = R.drawable.image_video_basic_graphic_design,
                description = "A comprehensive introduction to graphic design, covering principles, tools, and beginner techniques.",
                rate = 4.6,
                like = Random.nextInt(1, 100000),
                price = "$15.99",
                tone = R.drawable.icon_tone_2,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Graphic Design Basics",
                        detail = listOf(
                            DetailSession(
                                "What is Graphic Design?",
                                duration = 15,
                                isPlayed = true
                            ),
                            DetailSession(
                                "Understanding Design Elements",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession("The Design Process", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Tools for Graphic Design",
                        detail = listOf(
                            DetailSession(
                                "Introduction to Adobe Illustrator",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Working with Photoshop",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Figma for Graphic Design",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Design for Beginners",
                        detail = listOf(
                            DetailSession("Creating Basic Logos", duration = 25, isPlayed = false),
                            DetailSession(
                                "Designing Simple Flyers",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Creating Social Media Graphics",
                                duration = 20,
                                isPlayed = false
                            )
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 9,
                name = "White Lettering",
                image = R.drawable.image_video_white_lettering,
                description = "Understand the techniques of white lettering to enhance readability and add elegance to your designs.",
                rate = 4.5,
                like = Random.nextInt(1, 100000),
                price = "$16.99",
                tone = R.drawable.icon_tone_1,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Introduction to White Lettering",
                        detail = listOf(
                            DetailSession(
                                "What is White Lettering?",
                                duration = 20,
                                isPlayed = true
                            ),
                            DetailSession(
                                "White Lettering in Design",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Techniques for Effective Lettering",
                                duration = 30,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Advanced White Lettering",
                        detail = listOf(
                            DetailSession(
                                "Using Shadows and Highlights",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Creating Elegant Typography",
                                duration = 35,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Experimenting with Textures",
                                duration = 40,
                                isPlayed = false
                            )
                        )
                    ),
                    Session(
                        name = "Practical White Lettering",
                        detail = listOf(
                            DetailSession(
                                "White Lettering for Branding",
                                duration = 25,
                                isPlayed = false
                            ),
                            DetailSession("Lettering for Posters", duration = 30, isPlayed = false),
                            DetailSession(
                                "Using White Lettering in Web Design",
                                duration = 35,
                                isPlayed = false
                            )
                        )
                    )
                ),
                owner = "John Doe"
            ),
            Video(
                id = 10,
                name = "Design Process",
                image = R.drawable.image_video_design_processes,
                description = "Gain insight into the design process, from brainstorming and wireframing to final execution.",
                rate = 4.9,
                like = Random.nextInt(1, 100000),
                price = "$24.99",
                tone = R.drawable.icon_tone_2,
                totalLessons = 9,
                session = listOf(
                    Session(
                        name = "Understanding the Design Process",
                        detail = listOf(
                            DetailSession("Brainstorming Ideas", duration = 15, isPlayed = true),
                            DetailSession("Wireframing Basics", duration = 20, isPlayed = false),
                            DetailSession("Prototyping in Design", duration = 25, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Executing the Design",
                        detail = listOf(
                            DetailSession(
                                "Creating High-Fidelity Designs",
                                duration = 30,
                                isPlayed = false
                            ),
                            DetailSession(
                                "Collaborating with Developers",
                                duration = 35,
                                isPlayed = false
                            ),
                            DetailSession("Testing and Iteration", duration = 40, isPlayed = false)
                        )
                    ),
                    Session(
                        name = "Design Review and Feedback",
                        detail = listOf(
                            DetailSession(
                                "Gathering User Feedback",
                                duration = 20,
                                isPlayed = false
                            ),
                            DetailSession("Implementing Changes", duration = 25, isPlayed = false),
                            DetailSession("Finalizing the Design", duration = 30, isPlayed = false)
                        )
                    )
                ),
                owner = "John Doe"
            )
        )
    }
}