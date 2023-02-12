package Tasks;

import java.io.PrintStream;

public class Task<T> extends BaseTask {
    public Task(Object id, String creationDate, String deadLine, String author, String description, priorityEnum priority) {
        super(id, creationDate, deadLine, author, description, priority);
    }

    @Override
    public void showInfo() {
        System.out.printf("""
                        ID задачи:  \t%s
                        Дата создания: \t%s
                        Дедлайн:    \t%s
                        Создан кем: \t%s
                        Описание:   \t%s
                        Приоритет:  \t%s
                        %n""",
                id,
                creationDate,
                deadLine,
                author,
                description,
                priority
        );

    }

    @Override
    public void importData() {

    }
}