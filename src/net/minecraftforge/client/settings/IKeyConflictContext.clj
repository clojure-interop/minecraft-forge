(ns net.minecraftforge.client.settings.IKeyConflictContext
  "Defines the context that a KeyBinding is used.
  Key conflicts occur when a KeyBinding has the same IKeyConflictContext and has conflicting modifiers and keyCodes."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.settings IKeyConflictContext]))

(defn active?
  "returns: true if conditions are met to activate KeyBindings with this context - `boolean`"
  (^Boolean [^IKeyConflictContext this]
    (-> this (.isActive))))

(defn conflicts
  "other - `net.minecraftforge.client.settings.IKeyConflictContext`

  returns: true if the other context can have KeyBinding conflicts with this one.
   This will be called on both contexts to check for conflicts. - `boolean`"
  (^Boolean [^IKeyConflictContext this ^net.minecraftforge.client.settings.IKeyConflictContext other]
    (-> this (.conflicts other))))

