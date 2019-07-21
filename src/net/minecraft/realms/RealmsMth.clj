(ns net.minecraft.realms.RealmsMth
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsMth]))

(defn ->realms-mth
  "Constructor."
  (^RealmsMth []
    (new RealmsMth )))

(defn *round-up
  "p-round-up-0 - `int`
  p-round-up-1 - `int`

  returns: `int`"
  (^Integer [^Integer p-round-up-0 ^Integer p-round-up-1]
    (RealmsMth/roundUp p-round-up-0 p-round-up-1)))

(defn *floor
  "p-floor-0 - `double`

  returns: `int`"
  (^Integer [^Double p-floor-0]
    (RealmsMth/floor p-floor-0)))

(defn *ceil
  "p-ceil-0 - `float`

  returns: `int`"
  (^Integer [^Float p-ceil-0]
    (RealmsMth/ceil p-ceil-0)))

(defn *lfloor
  "p-lfloor-0 - `double`

  returns: `long`"
  (^Long [^Double p-lfloor-0]
    (RealmsMth/lfloor p-lfloor-0)))

(defn *average
  "p-average-0 - `long[]`

  returns: `double`"
  (^Double [p-average-0]
    (RealmsMth/average p-average-0)))

(defn *next-float
  "p-next-float-0 - `java.util.Random`
  p-next-float-1 - `float`
  p-next-float-2 - `float`

  returns: `float`"
  (^Float [^java.util.Random p-next-float-0 ^Float p-next-float-1 ^Float p-next-float-2]
    (RealmsMth/nextFloat p-next-float-0 p-next-float-1 p-next-float-2)))

(defn *next-int
  "p-next-int-0 - `java.util.Random`
  p-next-int-1 - `int`
  p-next-int-2 - `int`

  returns: `int`"
  (^Integer [^java.util.Random p-next-int-0 ^Integer p-next-int-1 ^Integer p-next-int-2]
    (RealmsMth/nextInt p-next-int-0 p-next-int-1 p-next-int-2)))

(defn *sin
  "p-sin-0 - `float`

  returns: `float`"
  (^Float [^Float p-sin-0]
    (RealmsMth/sin p-sin-0)))

(defn *abs-floor
  "p-abs-floor-0 - `double`

  returns: `int`"
  (^Integer [^Double p-abs-floor-0]
    (RealmsMth/absFloor p-abs-floor-0)))

(defn *get-int
  "p-get-int-0 - `java.lang.String`
  p-get-int-1 - `int`
  p-get-int-2 - `int`

  returns: `int`"
  (^Integer [^java.lang.String p-get-int-0 ^Integer p-get-int-1 ^Integer p-get-int-2]
    (RealmsMth/getInt p-get-int-0 p-get-int-1 p-get-int-2))
  (^Integer [^java.lang.String p-get-int-0 ^Integer p-get-int-1]
    (RealmsMth/getInt p-get-int-0 p-get-int-1)))

(defn *clamp
  "p-clamp-0 - `int`
  p-clamp-1 - `int`
  p-clamp-2 - `int`

  returns: `int`"
  (^Integer [^Integer p-clamp-0 ^Integer p-clamp-1 ^Integer p-clamp-2]
    (RealmsMth/clamp p-clamp-0 p-clamp-1 p-clamp-2)))

(defn *sqrt
  "p-sqrt-0 - `double`

  returns: `float`"
  (^Float [^Double p-sqrt-0]
    (RealmsMth/sqrt p-sqrt-0)))

(defn *cos
  "p-cos-0 - `float`

  returns: `float`"
  (^Float [^Float p-cos-0]
    (RealmsMth/cos p-cos-0)))

(defn *fast-floor
  "p-fast-floor-0 - `double`

  returns: `int`"
  (^Integer [^Double p-fast-floor-0]
    (RealmsMth/fastFloor p-fast-floor-0)))

(defn *abs
  "p-abs-0 - `float`

  returns: `float`"
  (^Float [^Float p-abs-0]
    (RealmsMth/abs p-abs-0)))

(defn *clamped-lerp
  "p-clamped-lerp-0 - `double`
  p-clamped-lerp-2 - `double`
  p-clamped-lerp-4 - `double`

  returns: `double`"
  (^Double [^Double p-clamped-lerp-0 ^Double p-clamped-lerp-2 ^Double p-clamped-lerp-4]
    (RealmsMth/clampedLerp p-clamped-lerp-0 p-clamped-lerp-2 p-clamped-lerp-4)))

(defn *abs-max
  "p-abs-max-0 - `double`
  p-abs-max-2 - `double`

  returns: `double`"
  (^Double [^Double p-abs-max-0 ^Double p-abs-max-2]
    (RealmsMth/absMax p-abs-max-0 p-abs-max-2)))

(defn *empty?
  "p-is-empty-0 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String p-is-empty-0]
    (RealmsMth/isEmpty p-is-empty-0)))

(defn *wrap-degrees
  "p-wrap-degrees-0 - `double`

  returns: `double`"
  (^Double [^Double p-wrap-degrees-0]
    (RealmsMth/wrapDegrees p-wrap-degrees-0)))

(defn *int-floor-div
  "p-int-floor-div-0 - `int`
  p-int-floor-div-1 - `int`

  returns: `int`"
  (^Integer [^Integer p-int-floor-div-0 ^Integer p-int-floor-div-1]
    (RealmsMth/intFloorDiv p-int-floor-div-0 p-int-floor-div-1)))

(defn *next-double
  "p-next-double-0 - `java.util.Random`
  p-next-double-1 - `double`
  p-next-double-3 - `double`

  returns: `double`"
  (^Double [^java.util.Random p-next-double-0 ^Double p-next-double-1 ^Double p-next-double-3]
    (RealmsMth/nextDouble p-next-double-0 p-next-double-1 p-next-double-3)))

(defn *smallest-encompassing-power-of-two
  "p-smallest-encompassing-power-of-two-0 - `int`

  returns: `int`"
  (^Integer [^Integer p-smallest-encompassing-power-of-two-0]
    (RealmsMth/smallestEncompassingPowerOfTwo p-smallest-encompassing-power-of-two-0)))

(defn *get-double
  "p-get-double-0 - `java.lang.String`
  p-get-double-1 - `double`
  p-get-double-3 - `double`

  returns: `double`"
  (^Double [^java.lang.String p-get-double-0 ^Double p-get-double-1 ^Double p-get-double-3]
    (RealmsMth/getDouble p-get-double-0 p-get-double-1 p-get-double-3))
  (^Double [^java.lang.String p-get-double-0 ^Double p-get-double-1]
    (RealmsMth/getDouble p-get-double-0 p-get-double-1)))

(defn *log-2
  "p-log-2-0 - `int`

  returns: `int`"
  (^Integer [^Integer p-log-2-0]
    (RealmsMth/log2 p-log-2-0)))

