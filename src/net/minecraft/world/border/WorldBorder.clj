(ns net.minecraft.world.border.WorldBorder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.border WorldBorder]))

(defn ->world-border
  "Constructor."
  (^WorldBorder []
    (new WorldBorder )))

(defn get-center-x
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.getCenterX))))

(defn min-x
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.minX))))

(defn get-diameter
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.getDiameter))))

(defn get-time-until-target
  "returns: `long`"
  (^Long [^WorldBorder this]
    (-> this (.getTimeUntilTarget))))

(defn set-center
  "x - `double`
  z - `double`"
  ([^WorldBorder this ^Double x ^Double z]
    (-> this (.setCenter x z))))

(defn get-closest-distance
  "x - `double`
  z - `double`

  returns: `double`"
  (^Double [^WorldBorder this ^Double x ^Double z]
    (-> this (.getClosestDistance x z)))
  (^Double [^WorldBorder this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getClosestDistance entity-in))))

(defn get-status
  "returns: `net.minecraft.world.border.EnumBorderStatus`"
  (^net.minecraft.world.border.EnumBorderStatus [^WorldBorder this]
    (-> this (.getStatus))))

(defn contains
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldBorder this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.contains pos))))

(defn max-x
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.maxX))))

(defn min-z
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.minZ))))

(defn remove-listener
  "listener - `net.minecraft.world.border.IBorderListener`"
  ([^WorldBorder this ^net.minecraft.world.border.IBorderListener listener]
    (-> this (.removeListener listener))))

(defn set-damage-amount
  "new-amount - `double`"
  ([^WorldBorder this ^Double new-amount]
    (-> this (.setDamageAmount new-amount))))

(defn add-listener
  "listener - `net.minecraft.world.border.IBorderListener`"
  ([^WorldBorder this ^net.minecraft.world.border.IBorderListener listener]
    (-> this (.addListener listener))))

(defn get-damage-amount
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.getDamageAmount))))

(defn set-damage-buffer
  "buffer-size - `double`"
  ([^WorldBorder this ^Double buffer-size]
    (-> this (.setDamageBuffer buffer-size))))

(defn get-warning-distance
  "returns: `int`"
  (^Integer [^WorldBorder this]
    (-> this (.getWarningDistance))))

(defn get-warning-time
  "returns: `int`"
  (^Integer [^WorldBorder this]
    (-> this (.getWarningTime))))

(defn set-size
  "size - `int`"
  ([^WorldBorder this ^Integer size]
    (-> this (.setSize size))))

(defn get-target-size
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.getTargetSize))))

(defn set-warning-time
  "warning-time - `int`"
  ([^WorldBorder this ^Integer warning-time]
    (-> this (.setWarningTime warning-time))))

(defn set-warning-distance
  "warning-distance - `int`"
  ([^WorldBorder this ^Integer warning-distance]
    (-> this (.setWarningDistance warning-distance))))

(defn get-center-z
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.getCenterZ))))

(defn max-z
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.maxZ))))

(defn get-resize-speed
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.getResizeSpeed))))

(defn get-size
  "returns: `int`"
  (^Integer [^WorldBorder this]
    (-> this (.getSize))))

(defn set-transition
  "old-size - `double`
  new-size - `double`
  time - `long`"
  ([^WorldBorder this ^Double old-size ^Double new-size ^Long time]
    (-> this (.setTransition old-size new-size time)))
  ([^WorldBorder this ^Double new-size]
    (-> this (.setTransition new-size))))

(defn get-damage-buffer
  "returns: `double`"
  (^Double [^WorldBorder this]
    (-> this (.getDamageBuffer))))

