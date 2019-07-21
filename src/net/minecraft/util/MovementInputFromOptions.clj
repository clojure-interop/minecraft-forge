(ns net.minecraft.util.MovementInputFromOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util MovementInputFromOptions]))

(defn ->movement-input-from-options
  "Constructor.

  game-settings-in - `net.minecraft.client.settings.GameSettings`"
  (^MovementInputFromOptions [^net.minecraft.client.settings.GameSettings game-settings-in]
    (new MovementInputFromOptions game-settings-in)))

(defn update-player-move-state
  ""
  ([^MovementInputFromOptions this]
    (-> this (.updatePlayerMoveState))))

