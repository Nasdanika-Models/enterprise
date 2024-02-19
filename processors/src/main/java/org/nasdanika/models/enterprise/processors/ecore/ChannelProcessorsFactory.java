/**
 */
package org.nasdanika.models.enterprise.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.enterprise.EnterprisePackage;

@EClassifierNodeProcessorFactory(classifierID = EnterprisePackage.CHANNEL)
public class ChannelProcessorsFactory {	
	
	private Context context;

	public ChannelProcessorsFactory(Context context) {
		this.context = context;
	}

	@EClassifierNodeProcessorFactory(
			description = "Something that passes messages between stakeholders",
			documentation = 
                    """
					Channel is something that passes messages between stakeholders.
					Channels can transform/enrich and aggregate messages.
					
					Channels can be:
					
					* Synchronous or asynchronous. Texting and e-mail are asynchronous. Phone and video are synchronous.
					* Pushing or polling. Calling all your friends and telling them that you caught a fish is pushing. When your friends ask you about your fishing trip is polling.
					* Unidirectional or bidirectional
					* Delivering to a single recipient or multiple recipients
					
					For example, a book might be considered as a message addressing potential readers' concerns.
					It is delivered over the publisher channel (LeanPub, Amazon), which is:
					
					* Asynchronous, 
					* Polling, 
					* Might be bidirectional if readers can contact the author,  
					* Delivers to multiple recipients, 
					* Aggregates chapters with each chapter being a message on its own adressing specific readers' concerns,
					* Transforms the book to multiple formats (PDF, EPUB, Web).
					
					## Examples
					
					This section contains examples of channels in a software development enterprise consisting of human and automation stakeholders.
					While it might be argued that an automation stakeholder is a resource, we'll consider it as a stakholder because it can receive
					messages and act on them including sending other messages.
					
					### Version control system
					
					Version control systems like [Git](https://git-scm.com/) ([GitHub](https://github.com/), [GitLab](https://gitlab.com/)) can
					be considered a distributed event store and stream-processing platform similar to [Apache Kafka](https://kafka.apache.org/).
					
					Commit is an event/message, branches are streams of commits. 
					Both humans and automated agents may receive messages by polling (pull) or pushing (web hooks).
					
					Sample scenario:
					
					* A developer commits a new Java file
					* An automated AI assistant
					    * Inspects the new file 
					    * Generates JUnit test cases and JavaDoc comments
					    * Commits them to a new branch
					    * Creates a [merge](https://docs.gitlab.com/ee/user/project/merge_requests/)/[pull](https://docs.github.com/en/pull-requests) request assigning it to the developer who committed the file
					* The developer
					    * Reviews proposed generated changes
					    * Makes necessary adjustments
					    * Merges changes     
					    
					There are two demos of the above scenario - retrieving sources from GitLab, generating a test case using OpenAI, committing generated code and creating a merge request:
					
					* [TestGitLab](https://github.com/Nasdanika-Models/rules/blob/main/tests/analyzer/src/test/java/org/nasdanika/models/rules/tests/analyzer/tests/TestGitLab.java) - all functionality 
					is implemented in a single test method with 80 lines of code leveraging [Nasdanika Java Model](https://java.models.nasdanika.org/)
					with [Nasdanika GitLab Model](https://gitlab.models.nasdanika.org/)'s 
					[GitLabURIHandler](https://github.com/Nasdanika-Models/gitlab/blob/main/model/src/main/java/org/nasdanika/models/gitlab/util/GitLabURIHandler.java) 
					to transparently load and parse Java files, and [gitlab4j-api](https://github.com/gitlab4j/gitlab4j-api) to commit generated sources and create a merge request.
					* [TestAnalyzers.testTheoryBuilder()](https://github.com/Nasdanika-Models/rules/blob/main/tests/analyzer/src/test/java/org/nasdanika/models/rules/tests/analyzer/tests/TestAnalyzers.java#L221)
					and [ReflectiveInspectors.untestedMethodInspector()](https://github.com/Nasdanika-Models/rules/blob/main/tests/inspectors/src/main/java/org/nasdanika/models/rules/tests/inspectors/ReflectiveInspectors.java#L68)
					implement the same functionality using [Nasdanika Rules](https://rules.models.nasdanika.org/) to separate loading, inspection, and commit/merge request concerns.
					
					Version control system can be also used to pass "messsages" - files - to a web browser. Examples:
					
					* [GitHub Pages](https://pages.github.com/)
					* [jsDelivr for GitHub](https://www.jsdelivr.com/github)                            
					
					### Issue management system
					
					An [issue tracking system](https://en.wikipedia.org/wiki/Issue_tracking_system) like GitHub issues or [Jira](https://www.atlassian.com/software/jira) may also be
					considered as a channel with issues being messages.
					
					In the above example, an automated AI assistant may:
					
					* Create an issue to merge generated code
					* Attach generated source code to the issue instead of creating a branch and a merge/pull request
					* Or establish a link between the issue and the branch or merge/pull request
					* Asssign the issue to the same developer
					* Add the issue to the backlog or to the next/current sprint
					* Link the issue to a parent issue (epic/initiative) which tracks progress of addressing technical debt
					
					In the above example there are multiple recipients of the message (issue):
					
					* Developer - responsible, needs to address the issue by merging code
					* Scrum master - accountable, ensures that the merge is performed by the developer 
					* Leadership - informed via dashboards or other means about the level of code coverage and amount of effort spent on addressing technical debt. An example of message aggregation.  
					
					### Maven repository
					
					A Maven repository can be used to pass generated documentation "messaages" to development environments such as Eclipse
					and web browsers using solutions like https://javadoc.io/ as an intermediary channel.
					
					### P2 repository

					[P2](https://eclipse.dev/equinox/p2/) repositories can be used to deliver integrated documentation "messages" - bundles/plugins - to Eclipse IDE
					including Eclipse Help System server.                         					                        
					
                    """
	)
	public EClassNodeProcessor createChannelProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}	
			
		};
	}
	
} 
