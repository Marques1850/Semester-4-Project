/*
 * Copyright (c) 2013-2023 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package ecourse.base.infrastructure.persistence;

import ecourse.base.EnrollmentManagment.repositories.EnrollmentRepository;
import ecourse.base.ExamMagnament.repositories.ExamRepository;
import ecourse.base.ExamMagnament.repositories.FormativeExamRepository;
import ecourse.base.ExamMagnament.repositories.QuestionRepository;
import ecourse.base.MeetingManagement.InvitationManagement.repositories.MeetingInviteRepository;
import ecourse.base.MeetingManagement.repositories.MeetingRepository;
import ecourse.base.PostItMagnament.PostItRepository;
import ecourse.base.boardManagment.repositories.BoardChangesRepository;
import ecourse.base.boardManagment.repositories.BoardRepository;
import ecourse.base.classSchedule.repositories.ClassRepository;
import ecourse.base.classSchedule.repositories.ExtraClassRepository;
import ecourse.base.clientusermanagement.repositories.ClientUserRepository;
import ecourse.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import ecourse.base.courseManagement.repositories.CourseRepository;
import ecourse.base.usermanagement.UserRegistration.eCourseUserRepository;

/**
 * @author Paulo Gandra Sousa
 *
 */
public interface RepositoryFactory {

    /**
     * factory method to create a transactional context to use in the repositories
     *
     * @return
     */
    TransactionalContext newTransactionalContext();

    /**
     *
     * @param autoTx
     *            the transactional context to enrol
     * @return
     */
    UserRepository users(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    UserRepository users();

    eCourseUserRepository eCourseUsers(TransactionalContext autoTx);
    eCourseUserRepository eCourseUsers();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    ClientUserRepository clientUsers(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    ClientUserRepository clientUsers();

    /**
     *
     * @param autoTx
     *            the transactional context to enroll
     * @return
     */
    SignupRequestRepository signupRequests(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     *
     * @return
     */
    SignupRequestRepository signupRequests();

    CourseRepository courses(TransactionalContext autoTx);
    CourseRepository courses();

    ExamRepository exams(TransactionalContext autoTx);
    ExamRepository exams();

    FormativeExamRepository formativeexams(TransactionalContext autoTx);
    FormativeExamRepository formativeexams();

    EnrollmentRepository enrollments(TransactionalContext autoTx);
    EnrollmentRepository enrollments();

    MeetingRepository meetings(TransactionalContext autoTx);
    MeetingRepository meetings();

    ClassRepository classes(TransactionalContext autoTx);
    ClassRepository classes();

    ExtraClassRepository extraClasses(TransactionalContext autoTx);
    ExtraClassRepository extraClasses();

    MeetingInviteRepository meetingInvites(TransactionalContext autoTx);

    MeetingInviteRepository meetingInvites();

    BoardRepository BoardRepository(TransactionalContext autoTx);
    BoardRepository BoardRepository();

    PostItRepository PostItRepository(TransactionalContext autoTx);
    PostItRepository PostItRepository();

    BoardChangesRepository BoardChangesRepository(TransactionalContext autoTx);
    BoardChangesRepository BoardChangesRepository();

    QuestionRepository questions(TransactionalContext autoTx);
    QuestionRepository questions();

}
