package com.virgin.money.ui.people

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.virgin.money.R
import com.virgin.money.`data`.models.People
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class PeopleFragmentDirections private constructor() {
  private data class ActionNavigationPeopleToNavigationPeopleDetails(
    public val people: People
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_people_to_navigation_people_details

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(People::class.java)) {
          result.putParcelable("people", this.people as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(People::class.java)) {
          result.putSerializable("people", this.people as Serializable)
        } else {
          throw UnsupportedOperationException(People::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionNavigationPeopleToNavigationPeopleDetails(people: People): NavDirections =
        ActionNavigationPeopleToNavigationPeopleDetails(people)
  }
}
