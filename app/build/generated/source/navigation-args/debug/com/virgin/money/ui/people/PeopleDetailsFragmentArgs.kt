package com.virgin.money.ui.people

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.virgin.money.`data`.models.People
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class PeopleDetailsFragmentArgs(
  public val people: People
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(People::class.java)) {
      result.set("people", this.people as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(People::class.java)) {
      result.set("people", this.people as Serializable)
    } else {
      throw UnsupportedOperationException(People::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): PeopleDetailsFragmentArgs {
      bundle.setClassLoader(PeopleDetailsFragmentArgs::class.java.classLoader)
      val __people : People?
      if (bundle.containsKey("people")) {
        if (Parcelable::class.java.isAssignableFrom(People::class.java) ||
            Serializable::class.java.isAssignableFrom(People::class.java)) {
          __people = bundle.get("people") as People?
        } else {
          throw UnsupportedOperationException(People::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__people == null) {
          throw IllegalArgumentException("Argument \"people\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"people\" is missing and does not have an android:defaultValue")
      }
      return PeopleDetailsFragmentArgs(__people)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PeopleDetailsFragmentArgs {
      val __people : People?
      if (savedStateHandle.contains("people")) {
        if (Parcelable::class.java.isAssignableFrom(People::class.java) ||
            Serializable::class.java.isAssignableFrom(People::class.java)) {
          __people = savedStateHandle.get<People?>("people")
        } else {
          throw UnsupportedOperationException(People::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__people == null) {
          throw IllegalArgumentException("Argument \"people\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"people\" is missing and does not have an android:defaultValue")
      }
      return PeopleDetailsFragmentArgs(__people)
    }
  }
}
