(ns net.minecraft.client.settings.KeyBinding
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.settings KeyBinding]))

(defn ->key-binding
  "Constructor.

  Convenience constructor for creating KeyBindings with keyConflictContext and keyModifier set.

  description - `java.lang.String`
  key-conflict-context - `net.minecraftforge.client.settings.IKeyConflictContext`
  key-modifier - `net.minecraftforge.client.settings.KeyModifier`
  key-code - `int`
  category - `java.lang.String`"
  (^KeyBinding [^java.lang.String description ^net.minecraftforge.client.settings.IKeyConflictContext key-conflict-context ^net.minecraftforge.client.settings.KeyModifier key-modifier ^Integer key-code ^java.lang.String category]
    (new KeyBinding description key-conflict-context key-modifier key-code category))
  (^KeyBinding [^java.lang.String description ^net.minecraftforge.client.settings.IKeyConflictContext key-conflict-context ^Integer key-code ^java.lang.String category]
    (new KeyBinding description key-conflict-context key-code category))
  (^KeyBinding [^java.lang.String description ^Integer key-code ^java.lang.String category]
    (new KeyBinding description key-code category)))

(defn *on-tick
  "key-code - `int`"
  ([^Integer key-code]
    (KeyBinding/onTick key-code)))

(defn *set-key-bind-state
  "key-code - `int`
  pressed - `boolean`"
  ([^Integer key-code ^Boolean pressed]
    (KeyBinding/setKeyBindState key-code pressed)))

(defn *update-key-bind-state
  ""
  ([]
    (KeyBinding/updateKeyBindState )))

(defn *un-press-all-keys
  ""
  ([]
    (KeyBinding/unPressAllKeys )))

(defn *reset-key-binding-array-and-hash
  ""
  ([]
    (KeyBinding/resetKeyBindingArrayAndHash )))

(defn *get-keybinds
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set []
    (KeyBinding/getKeybinds )))

(defn set-key-code
  "key-code - `int`"
  ([^KeyBinding this ^Integer key-code]
    (-> this (.setKeyCode key-code))))

(defn set-key-conflict-context
  "key-conflict-context - `net.minecraftforge.client.settings.IKeyConflictContext`"
  ([^KeyBinding this ^net.minecraftforge.client.settings.IKeyConflictContext key-conflict-context]
    (-> this (.setKeyConflictContext key-conflict-context))))

(defn get-key-description
  "returns: `java.lang.String`"
  (^java.lang.String [^KeyBinding this]
    (-> this (.getKeyDescription))))

(defn conflicts
  "Returns true when the other keyBinding conflicts with this one

  other - `net.minecraft.client.settings.KeyBinding`

  returns: `boolean`"
  (^Boolean [^KeyBinding this ^net.minecraft.client.settings.KeyBinding other]
    (-> this (.conflicts other))))

(defn has-key-code-modifier-conflict?
  "Returns true when one of the bindings' key codes conflicts with the other's modifier.

  other - `net.minecraft.client.settings.KeyBinding`

  returns: `boolean`"
  (^Boolean [^KeyBinding this ^net.minecraft.client.settings.KeyBinding other]
    (-> this (.hasKeyCodeModifierConflict other))))

(defn get-key-conflict-context
  "returns: `net.minecraftforge.client.settings.IKeyConflictContext`"
  (^net.minecraftforge.client.settings.IKeyConflictContext [^KeyBinding this]
    (-> this (.getKeyConflictContext))))

(defn get-key-category
  "returns: `java.lang.String`"
  (^java.lang.String [^KeyBinding this]
    (-> this (.getKeyCategory))))

(defn get-display-name
  "returns: `java.lang.String`"
  (^java.lang.String [^KeyBinding this]
    (-> this (.getDisplayName))))

(defn set-to-default-value?
  "returns: `boolean`"
  (^Boolean [^KeyBinding this]
    (-> this (.isSetToDefaultValue))))

(defn get-key-code
  "returns: `int`"
  (^Integer [^KeyBinding this]
    (-> this (.getKeyCode))))

(defn get-key-modifier-default
  "returns: `net.minecraftforge.client.settings.KeyModifier`"
  (^net.minecraftforge.client.settings.KeyModifier [^KeyBinding this]
    (-> this (.getKeyModifierDefault))))

(defn set-key-modifier-and-code
  "key-modifier - `net.minecraftforge.client.settings.KeyModifier`
  key-code - `int`"
  ([^KeyBinding this ^net.minecraftforge.client.settings.KeyModifier key-modifier ^Integer key-code]
    (-> this (.setKeyModifierAndCode key-modifier key-code))))

(defn pressed?
  "returns: `boolean`"
  (^Boolean [^KeyBinding this]
    (-> this (.isPressed))))

(defn key-down?
  "returns: `boolean`"
  (^Boolean [^KeyBinding this]
    (-> this (.isKeyDown))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.client.settings.KeyBinding`

  returns: `int`"
  (^Integer [^KeyBinding this ^net.minecraft.client.settings.KeyBinding p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn set-to-default
  ""
  ([^KeyBinding this]
    (-> this (.setToDefault))))

(defn active-and-matches?
  "Checks that the key conflict context and modifier are active, and that the keyCode matches this binding.

  key-code - `int`

  returns: `boolean`"
  (^Boolean [^KeyBinding this ^Integer key-code]
    (-> this (.isActiveAndMatches key-code))))

(defn get-key-code-default
  "returns: `int`"
  (^Integer [^KeyBinding this]
    (-> this (.getKeyCodeDefault))))

(defn get-key-modifier
  "returns: `net.minecraftforge.client.settings.KeyModifier`"
  (^net.minecraftforge.client.settings.KeyModifier [^KeyBinding this]
    (-> this (.getKeyModifier))))

