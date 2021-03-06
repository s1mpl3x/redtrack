package eu.over9000.redtrack.ui.cells;

import javafx.scene.control.ListCell;

import eu.over9000.redtrack.data.issue.Issue;

/**
 * Cell for Issues
 */
public class IssueListCell extends ListCell<Issue> {
	@Override
	protected void updateItem(final Issue item, final boolean empty) {
		super.updateItem(item, empty);

		if (empty || item == null) {
			setText(null);
			setGraphic(null);
		} else {
			setText(item.getId() + ": " + item.getSubject());
		}

	}
}
