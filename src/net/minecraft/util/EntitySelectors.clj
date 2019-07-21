(ns net.minecraft.util.EntitySelectors
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EntitySelectors]))

(defn ->entity-selectors
  "Constructor."
  (^EntitySelectors []
    (new EntitySelectors )))

(def *-is-alive
  "Static Constant.

  type: com.google.common.base.Predicate<net.minecraft.entity.Entity>"
  EntitySelectors/IS_ALIVE)

(def *-is-standalone
  "Static Constant.

  type: com.google.common.base.Predicate<net.minecraft.entity.Entity>"
  EntitySelectors/IS_STANDALONE)

(def *-has-inventory
  "Static Constant.

  type: com.google.common.base.Predicate<net.minecraft.entity.Entity>"
  EntitySelectors/HAS_INVENTORY)

(def *-can-ai-target
  "Static Constant.

  type: com.google.common.base.Predicate<net.minecraft.entity.Entity>"
  EntitySelectors/CAN_AI_TARGET)

(def *-not-spectating
  "Static Constant.

  type: com.google.common.base.Predicate<net.minecraft.entity.Entity>"
  EntitySelectors/NOT_SPECTATING)

(defn *within-range
  "x - `double`
  y - `double`
  z - `double`
  range - `double`

  returns: `<T extends net.minecraft.entity.Entity> com.google.common.base.Predicate<T>`"
  ([^Double x ^Double y ^Double z ^Double range]
    (EntitySelectors/withinRange x y z range)))

(defn *get-team-collision-predicate
  "entity-in - `net.minecraft.entity.Entity`

  returns: `<T extends net.minecraft.entity.Entity> com.google.common.base.Predicate<T>`"
  ([^net.minecraft.entity.Entity entity-in]
    (EntitySelectors/getTeamCollisionPredicate entity-in)))

(defn *not-riding
  "p-191324-0 - `net.minecraft.entity.Entity`

  returns: `com.google.common.base.Predicate<net.minecraft.entity.Entity>`"
  (^com.google.common.base.Predicate [^net.minecraft.entity.Entity p-191324-0]
    (EntitySelectors/notRiding p-191324-0)))

