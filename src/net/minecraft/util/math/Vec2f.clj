(ns net.minecraft.util.math.Vec2f
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math Vec2f]))

(defn ->vec-2f
  "Constructor.

  x-in - `float`
  y-in - `float`"
  (^Vec2f [^Float x-in ^Float y-in]
    (new Vec2f x-in y-in)))

(def *-zero
  "Static Constant.

  type: net.minecraft.util.math.Vec2f"
  Vec2f/ZERO)

(def *-one
  "Static Constant.

  type: net.minecraft.util.math.Vec2f"
  Vec2f/ONE)

(def *-unit-x
  "Static Constant.

  type: net.minecraft.util.math.Vec2f"
  Vec2f/UNIT_X)

(def *-negative-unit-x
  "Static Constant.

  type: net.minecraft.util.math.Vec2f"
  Vec2f/NEGATIVE_UNIT_X)

(def *-unit-y
  "Static Constant.

  type: net.minecraft.util.math.Vec2f"
  Vec2f/UNIT_Y)

(def *-negative-unit-y
  "Static Constant.

  type: net.minecraft.util.math.Vec2f"
  Vec2f/NEGATIVE_UNIT_Y)

(def *-max
  "Static Constant.

  type: net.minecraft.util.math.Vec2f"
  Vec2f/MAX)

(def *-min
  "Static Constant.

  type: net.minecraft.util.math.Vec2f"
  Vec2f/MIN)

(defn x
  "Instance Constant.

  type: float"
  (^Float [^Vec2f this]
    (-> this .-x)))

(defn y
  "Instance Constant.

  type: float"
  (^Float [^Vec2f this]
    (-> this .-y)))

