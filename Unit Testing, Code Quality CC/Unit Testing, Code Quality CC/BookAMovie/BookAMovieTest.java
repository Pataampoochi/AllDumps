import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookAMovieTest {

	static BookAMovie bookAMovie;

	@Before
	public void setUp() throws Exception {
		bookAMovie = new BookAMovie();
		// Try to create few MovieTicket objects and add to a list.
		// Set that list to movieTicketList in BookAMovie using setMovieTicketList
		// method
		List<MovieTicket> movieList = new ArrayList<MovieTicket>();
		movieList.add(new MovieTicket(1000, "Goblin", 10, 50, "king", LocalDate.of(2020, 1, 20)));
		movieList.add(new MovieTicket(1001, "Death Note", 10, 50, "queen", LocalDate.of(2020, 1, 22)));
		movieList.add(new MovieTicket(1002, "Steins Gate", 10, 50, "king", LocalDate.of(2020, 1, 24)));
		movieList.add(new MovieTicket(1003, "Fullmetal Alchemist", 10, 50, "queen", LocalDate.of(2020, 1, 26)));
		movieList.add(new MovieTicket(1004, "Baki", 10, 50, "king", LocalDate.of(2020, 1, 28)));
		bookAMovie.setMovieTicketList(movieList);
	}

	@Test
	public void test11ValidateCircleWhenKing() throws InvalidMovieTicketException {

		// test the validateCircle method when a valid circle king is provided
		assertTrue(bookAMovie.validateCircle("king"));
	}

	@Test
	public void test12ValidateCircleWhenQueen() throws InvalidMovieTicketException {

		// test the validateCircle method when a valid circle queen is provided.
		assertTrue(bookAMovie.validateCircle("queen"));
	}

	@Test(expected = InvalidMovieTicketException.class)
	public void test13ValidateCircleWhenInvalid() throws InvalidMovieTicketException {

		// test the validateCircle method when an invalid circle is passed to this
		// method
		bookAMovie.validateCircle("jack");
	}

	@Test
	public void test14AddMovieTicketForValidCircle() throws InvalidMovieTicketException {

		// test the addMovieTicket method when valid circle is provided for the
		// MovieTicket
		assertTrue(bookAMovie.addMovieTicket(1005, "Hospital Playlist", 10, 50, "king", LocalDate.of(2020, 1, 27)));
	}

	@Test(expected = InvalidMovieTicketException.class)
	public void test15AddMovieTicketForInvalidCircle() throws InvalidMovieTicketException {

		// test the addMovieTicket method when invalid circle is provided for the
		// MovieTicket
		bookAMovie.addMovieTicket(1005, "Hospital Playlist", 10, 50, "jack", LocalDate.of(2020, 1, 27));
	}

	@Test
	public void test16ViewMovieTicketByIdForValidId() throws InvalidMovieTicketException {

		// test the viewMovieTicketById method when a ticketId is passed as parameter
		// exists in
		// the movieTicketList
		assertTrue(bookAMovie.viewMovieTicketById(1000).getTicketId() == 1000);
	}

	@Test(expected = InvalidMovieTicketException.class)
	public void test17ViewMovieTicketByIdForInvalidId() throws InvalidMovieTicketException {

		// test the viewMovieTicketById method when a ticketId is passed as parameter
		// does not exist in the movieTicketList
		bookAMovie.viewMovieTicketById(900);
	}

	@Test
	public void test18ViewMovieTicketByScreen() {

		// test the viewMovieTicketByScreen method
		assertFalse(bookAMovie.viewMovieTicketByScreen(10).isEmpty());
	}

	@Test
	public void test19VewTicketsMovieWise() {

		// test the viewTicketsMovieWise method
		assertFalse(bookAMovie.viewTicketsMovieWise().isEmpty());
	}

	@Test
	public void test20ViewScreenWiseTotalSeatsBooked() {

		// test the viewScreenWiseTotalSeatsBooked method
		assertFalse(bookAMovie.viewScreenWiseTotalSeatsBooked(LocalDate.of(2020, 1, 20), LocalDate.now()).isEmpty());
	}

}
