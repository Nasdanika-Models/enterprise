var searchDocuments = {"references/eClassifiers/Concern/index.html":{"action-uuid":"705c205d-3834-46bf-9586-d1c4e43e4f2d","title":"Concern","content":"A concern is a matter of interest or importance to a stakeholder. When a guy goes fishing his concerns are to buy bait, fuel the boat, find a good spot and catch fish. Fishing inspector&rsquo;s concerns are that the guy has a vailid fishing license and catches fish in accordance with the fishing regulations. And the wife&rsquo;s concerns are how much and what kind of fish the guy catches."},"glossary.html":{"action-uuid":"0e6c5942-6be6-4dcc-9bb6-ba808ddebcbb","title":"Glossary","content":"Clear Identifier(s) Hide UUID {{data.value.name}} {{data.value[0].value}} {{item.value}}"},"references/eClassifiers/RepresentationElementKind/index.html":{"action-uuid":"0fa4a67c-493f-4aa9-8499-5588f6fa9f6b","title":"Representation Element Kind","content":"A specification of the conventions for a particular representation element. Representation elements are instances of representation element kinds. For example, a cylinder is a representation kind for storage/database components, the Data Sources and Store on the RAG component diagram are representation elements of the &ldquo;Storage/Database&rdquo; kind. Different colors of &ldquo;Data Sources&rdquo; representation may highlight heterogeneity of the data sources - plain text, PDF, HTML. And monochromaticity of the &ldquo;Store&rdquo; representation element indicates homogeneity of the &ldquo;Store&rdquo; semantic element."},"references/eClassifiers/SemanticDomainDescription/index.html":{"action-uuid":"67b6e640-da74-4413-a11d-f18459358410","title":"Semantic Domain Description","content":"Semantic Domain Description is a collection of views into a set of semantic domains, on which the enterprise operates, addressing a set of stakeholder concerns. Sample Family is an example of a semantic domain description which describes the eponymous semantic domain of Family semantic domain kind."},"references/eClassifiers/Enterprise/references/eStructuralFeatures/stakeholders/index.html":{"path":"Enterprise/References/Stakeholders","action-uuid":"f659db47-3e3f-45ea-93bf-73095ca5995c","title":"Stakeholders","content":"An enterprise has one ore more stakeholders. Some stakehodlers may participate in the operations of the enterprise to achieve its mission. Some others may have an interest, but not participate in achieving the mission. They may even be interested in the enterprise not achieving its mission!"},"references/eClassifiers/Enterprise/references/eStructuralFeatures/operatesOn/index.html":{"path":"Enterprise/References/Operates on","action-uuid":"09c55278-3133-4e0f-a490-1e3c1896ad09","title":"Operates on","content":"An enterprise operates on one or more semantic domains. For example, an Agile team developing Spring microservices to be deployed to Kubernetes operates on at least three semantic domains - Agile (stories, sprints, &hellip;), Spring (controllers, &hellip;), and Kubernetes (deployments, images, &hellip;)"},"references/eClassifiers/SemanticElementKind/index.html":{"action-uuid":"c4c4fff1-8389-4391-af2d-3395ee48dbe5","title":"Semantic Element Kind","content":"Semantic Element Kind is a kind/type/class of semantic elements. For example, in the Family semantic domain kind Man is a semantic element kind, and Paul is a semantic element of the Man kind."},"references/eClassifiers/SemanticElement/index.html":{"action-uuid":"7905611d-6162-453f-967c-7f7901d5a25d","title":"Semantic Element","content":"An element of a semantic domain of a specific semantic element kind. For example, Paul is an element of the sample family semantic domain of the Man kind represented by an image representation element on the family diagram representation."},"references/eClassifiers/Enterprise/index.html":{"action-uuid":"feb0d78b-b34f-4320-a82d-e6acde5bff8b","title":"Enterprise","content":"One definition of an enterprise is &ldquo;A group of people and resources devoted to achieving a mission.&rdquo;1 We will use the term &ldquo;stakeholder&rdquo; instead of &ldquo;people&rdquo;. A stakeholder can be a person, an organization/another enterprise, or an automated agent, including AI agents. Note that an enterprise may have a single stakeholder. Going fishing alone or with friends is an enterprise. Writing a book is also an enterprise. An enterprise operates on one or more semantic domains. For example, the book domain - author, reader, publisher, book, chapter, &hellip; Enterprises can be nested and interrelated. A classic example is a company with departments depending on each other. This model does not reflect this aspect for brevity. Enterprise Architecture by Example ?"},"references/eClassifiers/Representation/index.html":{"action-uuid":"f2532404-e697-41bb-8729-0c65923a9340","title":"Representation","content":"Representation is a group of related representation elements. For example: Diagram, say, family diagram or sample family diagram Table List Chart/Graph Text Image/Picture Some representations may be automatically generated. For example, Family Model UML Diagram."},"references/eClassifiers/Stakeholder/references/eStructuralFeatures/communicatesWith/index.html":{"path":"Stakeholder/References/Comminicates With","action-uuid":"9f655c5e-9578-4e88-b44d-f50b39e77ee1","title":"Comminicates With","content":"Stakeholders to communicate with each other by exchanging messages, including self-messages."},"references/eClassifiers/Message/index.html":{"action-uuid":"d5a92ba6-7e97-4d76-8a90-bccb14016537","title":"Message","content":"A message is a type of view which is delivered to stakeholders via a channel. It might be argued that any view is delivered via some kind of channel and therefore is a message. This argument may be clarified in two ways: View is an abstract class focusing on addressing stakeholders concerns regardless of the channel. Message is a concrete class. There is some &ldquo;default&rdquo; channel delivering the semantic domain description. Views are delivered via the default channels and are not considered messages because they don&rsquo;t have a sender recipient. Any views exchanged between stakeholders via a non-default channel are messages. Example A class diagram (representation) and a table with class names and short descriptions (also a representation) constitute a view into a package. This view can be delivered to stakeholders as a: Web page (default channel) E-mail with HTML content E-mail with a PDF attachment"},"references/eClassifiers/SemanticDomain/index.html":{"action-uuid":"5ed9a5d3-c042-4165-bb6d-0ff8913991a6","title":"Semantic Domain","content":"See Semantic Domain Kind."},"references/eClassifiers/Viewpoint/index.html":{"action-uuid":"5c8abbaf-8a54-4ec6-8e1c-b75d44b57fd3","title":"Viewpoint","content":"Viewpoint is a specification of the conventions for a particular view kind/type. Views are instances of viewpoints. LinkedIn profile viewpoint specifies that a profile may contain &ldquo;Profile photo&rdquo; representation and &ldquo;Experience&rdquo; representation. In the above example of a web page view, the viewpoint may specify that a view shall contain an intro paragraph, a component diagram, an optional sequence diagram and then either a list or sub-sections with short descriptions of components."},"index.html":{"action-uuid":"fded68dc-37cf-4645-abcc-102c36cfa77f","title":"Enterprise Model","content":"A model of an enterprise and its relationship to semantic domains it operates on. This model can be used to: Establish a shared terminology and drive understanding of enterprise information pathways Document a particular enterprise - mission, stakeholders, concerns, &hellip; Continously adjust the enterprise to improve its efficiency by identifying and refining views, messages, channels and other elements One way to think about improvement of efficiency is minimization of the &ldquo;loss function&rdquo; - total amount of effort required to successfully pass messages between stakeholders. I.e. the receiving stakholder(s) fully understand the intent of the sender stakholder(s). This function is highly dependent on the structure of the enterprise. For example, a co-located team of senior developers might need just a whiteboard. At the same time an open source project with multiple contributors and consumers/users from around the globe wouldn&rsquo;t be able to function with just a whiteboard. Channel Something that passes messages between stakeholders frames Concern A matter of interest or importance to a stakeholder operates on Enterprise A group of parties (stakeholders) and resources devoted to achieving a mission delivered via is a type of Message A type of view which is delivered via a channel Representation A group of related representation elements represents Representation Element An element (part) of a representation governs Representation Element Kind A kind (type/class) of representation elements governs Representation Kind A specification of the conventions for a particular kind/type/class of representation Semantic Domain An area of meaning and the words used to talk about it describes Semantic Domain Description A collection of views into a set of semantic domains, on which the enterprise operates, addressing a set of stakeholder concerns governs Semantic Domain Kind A metamodel of a semantic domain Semantic Element An element of a semantic domain governs Semantic Element Kind A kind (type/class) of semantic elements has exchanges Stakeholder An entity having interest in the Enterprise adresses View A group of related representations of semantic domain elements of interest from the perspective of a related set of concerns governs Viewpoint A specification of the conventions for a particular view kind/type 1..* 1..* 1..* 1..* 1..* 1..* 1..* * * 1..* 1..*"},"references/eClassifiers/SemanticDomainKind/index.html":{"action-uuid":"be67a248-95a7-41d0-a700-0ad484bb02b2","title":"Semantic Domain Kind","content":"Simply put, &ldquo;Semantic Domain&rdquo; &asymp; terminology, jargon, lingo. More precisely, &ldquo;an area of meaning and the words used to talk about it &hellip;&rdquo;1 In this model the above definition is divided into: Semantic Domain Kind - the metamodel. For example, Book Class (Kind) contains Chapter Class (Kind). Another example is the Family Model Semantic Domain - the model, instances of classes/kinds. For example Beyond Diagrams book contains &ldquo;Terminology (Semantic Domain)&rdquo; chapter. An enterprise operates on one or more semantic domains. E.g. an author writes one or more books. Sample Family is a semantic domain of Family semantic domain kind. &ldquo;Kind&rdquo; is one of the terms which cause confusion. A synonym for Kind is &ldquo;Type&rdquo;, or &ldquo;Class&rdquo; in languages like Java, or (maybe), &ldquo;Prototype&rdquo; in languages like JavaScript. One way to think about is an empty paper or web form. A form for a person would have fields for &ldquo;First name&rdquo;, &ldquo;Last name&rdquo; and &ldquo;Date of birth&rdquo; with no values. An instance of a kind/type/class/prototype is a filled-out form with, say &ldquo;John&rdquo; for the first name and &ldquo;Smith&rdquo; for the last name. Instantiation is taking an empty form, making a copy of it, and then filling it out. https://en.wikipedia.org/wiki/Semantic_domain ?"},"references/eClassifiers/Stakeholder/index.html":{"action-uuid":"099e62ea-3d0a-4140-9910-12fd19a12954","title":"Stakeholder","content":"Stakeholder is some entity having interest in Enterprise achieving (or not achieving) its mission. That entity might be a person, organization, automated agent. Parties participating in the enterprise are stakeholders by definition - they have an interest in achieving the mission. For example, a guy goes fishing. His wife is interested whether he catches anything because it affects what she&rsquo;d need to cook for dinner. And maybe she hopes that he wouldn&rsquo;t catch anything, so she doesn&rsquo;t have to clean the fish and the eat it - she might prefer chicken or beef. Both of them are stakeholders. The guy is a single-stakeholder enterprise - so he is both an enterprise with a mission to catch fish and a participating stakehodler with an interest to catch fish. This enterprise also has resources - fishing rods, bait, boat, &hellip; The wife is a stakeholder as well, although she is not involved into the enterprise operations - buying bait, fueling the boat, catching fish, &hellip; To achieve the enterprise mission stakeholders separate concerns and collaborate by exchanging messages over communication channels. Even a single stakeholder may have multiple concerns and send messages to self over different channels. For example, create a shopping list (message) in a mobile application (channel) and a TODO list (message) in a paper planner (channel)."},"references/eClassifiers/Message/inheritance.html":{"path":"Message/Inheritance","action-uuid":"2a548237-b225-46a0-a5d9-17e4a3891224","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/View/inheritance.html":{"path":"View/Inheritance","action-uuid":"e99cf561-73e5-4f95-83b5-1aefb99a7ebc","title":"Inheritance","content":"Subtypes "},"references/eClassifiers/RepresentationElement/index.html":{"action-uuid":"c1e716ad-87a1-4720-8789-bbfe798e715e","title":"Representation Element","content":"An element of a representation representing zero or more semantic elements. For example: Diagram node or connection Table row or cell List item"},"references/eClassifiers/View/index.html":{"action-uuid":"0e866122-62e3-48b2-83fb-da74595d4198","title":"View","content":"View is a group of related representations of semantic domain elements of interest from the perspective of a related set of concerns. A LinkedIn profile is a view which contains &ldquo;Profile photo&rdquo; image representation and &ldquo;Experience&rdquo; list of cards representation. Another example, a web page with a component diagram, a list of component descriptions, and a sequence diagram showing components interaction is a view addressing stakeholder&rsquo;s concern of getting familiar with the system/solution. Diagrams and descriptions are representations. Another example is the Sample Family home page view with a family diagram representation addressing the &ldquo;What&rdquo; concern and several other representations addressing the &ldquo;How&rdquo; concern of a &ldquo;potential user&rdquo; stakeholder."},"references/eClassifiers/Channel/index.html":{"action-uuid":"7220465e-b995-4312-a2c5-1c5770006b16","title":"Channel","content":"Channel is something that passes messages between stakeholders. Channels can transform/enrich and aggregate messages. Channels can be: Synchronous or asynchronous. Texting and e-mail are asynchronous. Phone and video are synchronous. Pushing or polling. Calling all your friends and telling them that you caught a fish is pushing. When your friends ask you about your fishing trip is polling. Unidirectional or bidirectional Delivering to a single recipient or multiple recipients For example, a book might be considered as a message addressing potential readers&rsquo; concerns. It is delivered over the publisher channel (LeanPub, Amazon), which is: Asynchronous, Polling, Might be bidirectional if readers can contact the author, Delivers to multiple recipients, Aggregates chapters with each chapter being a message on its own adressing specific readers&rsquo; concerns, Transforms the book to multiple formats (PDF, EPUB, Web). Examples This section contains examples of channels in a software development enterprise consisting of human and automation stakeholders. While it might be argued that an automation stakeholder is a resource, we&rsquo;ll consider it as a stakholder because it can receive messages and act on them including sending other messages. Version control system Version control systems like Git (GitHub, GitLab) can be considered a distributed event store and stream-processing platform similar to Apache Kafka. Commit is an event/message, branches are streams of commits. Both humans and automated agents may receive messages by polling (pull) or pushing (web hooks). Sample scenario: A developer commits a new Java file An automated AI assistant Inspects the new file Generates JUnit test cases and JavaDoc comments Commits them to a new branch Creates a merge/pull request assigning it to the developer who committed the file The developer Reviews proposed generated changes Makes necessary adjustments Merges changes There are two demos of the above scenario - retrieving sources from GitLab, generating a test case using OpenAI, committing generated code and creating a merge request: TestGitLab - all functionality is implemented in a single test method with 80 lines of code leveraging Nasdanika Java Model with Nasdanika GitLab Model&rsquo;s GitLabURIHandler to transparently load and parse Java files, and gitlab4j-api to commit generated sources and create a merge request. TestAnalyzers.testTheoryBuilder() and ReflectiveInspectors.untestedMethodInspector() implement the same functionality using Nasdanika Rules to separate loading, inspection, and commit/merge request concerns. Version control system can be also used to pass &ldquo;messsages&rdquo; - files - to a web browser. Examples: GitHub Pages jsDelivr for GitHub Issue management system An issue tracking system like GitHub issues or Jira may also be considered as a channel with issues being messages. In the above example, an automated AI assistant may: Create an issue to merge generated code Attach generated source code to the issue instead of creating a branch and a merge/pull request Or establish a link between the issue and the branch or merge/pull request Asssign the issue to the same developer Add the issue to the backlog or to the next/current sprint Link the issue to a parent issue (epic/initiative) which tracks progress of addressing technical debt In the above example there are multiple recipients of the message (issue): Developer - responsible, needs to address the issue by merging code Scrum master - accountable, ensures that the merge is performed by the developer Leadership - informed via dashboards or other means about the level of code coverage and amount of effort spent on addressing technical debt. An example of message aggregation. Maven repository A Maven repository can be used to pass generated documentation &ldquo;messaages&rdquo; to development environments such as Eclipse and web browsers using solutions like https://javadoc.io/ as an intermediary channel. P2 repository P2 repositories can be used to deliver integrated documentation &ldquo;messages&rdquo; - bundles/plugins - to Eclipse IDE including Eclipse Help System server."},"references/eClassifiers/RepresentationKind/index.html":{"action-uuid":"8fb9113b-1e3d-4285-8d8c-44e7aa7ca792","title":"Representation Kind","content":"A specification of the conventions for a particular kind/type/class of representation. Representations are instances of representation kinds. For example, Sequence Diagram is a representation kind, the RAG sequence diagram is a representation of the &ldquo;Sequence diagram&rdquo; kind."},"references/eClassifiers/Stakeholder/references/eStructuralFeatures/concerns/index.html":{"path":"Stakeholder/References/Concerns","action-uuid":"0126393e-0ecf-428f-b5a2-e8280b8a50b0","title":"Concerns","content":"A stakeholder has one or more concerns - matters of interest or importance for the stakeholders. A stakeholder must have at least one concern - otherwise it woudln&rsquo;t be a stakholder."}}