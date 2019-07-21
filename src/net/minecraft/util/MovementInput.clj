(ns net.minecraft.util.MovementInput
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util MovementInput]))

(defn ->movement-input
  "Constructor."
  (^MovementInput []
    (new MovementInput )))

(defn move-strafe
  "Instance Field.

  type: float"
  (^Float [^MovementInput this]
    (-> this .-moveStrafe)))

(defn move-forward
  "Instance Field.

  type: float"
  (^Float [^MovementInput this]
    (-> this .-moveForward)))

(defn forward-key-down
  "Instance Field.

  type: boolean"
  (^Boolean [^MovementInput this]
    (-> this .-forwardKeyDown)))

(defn back-key-down
  "Instance Field.

  type: boolean"
  (^Boolean [^MovementInput this]
    (-> this .-backKeyDown)))

(defn left-key-down
  "Instance Field.

  type: boolean"
  (^Boolean [^MovementInput this]
    (-> this .-leftKeyDown)))

(defn right-key-down
  "Instance Field.

  type: boolean"
  (^Boolean [^MovementInput this]
    (-> this .-rightKeyDown)))

(defn jump
  "Instance Field.

  type: boolean"
  (^Boolean [^MovementInput this]
    (-> this .-jump)))

(defn sneak
  "Instance Field.

  type: boolean"
  (^Boolean [^MovementInput this]
    (-> this .-sneak)))

(defn update-player-move-state
  ""
  ([^MovementInput this]
    (-> this (.updatePlayerMoveState))))

(defn get-move-vector
  "returns: `net.minecraft.util.math.Vec2f`"
  (^net.minecraft.util.math.Vec2f [^MovementInput this]
    (-> this (.getMoveVector))))

