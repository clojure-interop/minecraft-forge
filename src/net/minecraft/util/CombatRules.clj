(ns net.minecraft.util.CombatRules
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util CombatRules]))

(defn ->combat-rules
  "Constructor."
  (^CombatRules []
    (new CombatRules )))

(defn *get-damage-after-absorb
  "damage - `float`
  total-armor - `float`
  toughness-attribute - `float`

  returns: `float`"
  (^Float [^Float damage ^Float total-armor ^Float toughness-attribute]
    (CombatRules/getDamageAfterAbsorb damage total-armor toughness-attribute)))

(defn *get-damage-after-magic-absorb
  "p-188401-0 - `float`
  p-188401-1 - `float`

  returns: `float`"
  (^Float [^Float p-188401-0 ^Float p-188401-1]
    (CombatRules/getDamageAfterMagicAbsorb p-188401-0 p-188401-1)))

