(ns net.minecraftforge.common.model.animation.CapabilityAnimation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation CapabilityAnimation]))

(defn ->capability-animation
  "Constructor."
  (^CapabilityAnimation []
    (new CapabilityAnimation )))

(defn *-animation-capability
  "Static Field.

  type: net.minecraftforge.common.capabilities.Capability<net.minecraftforge.common.model.animation.IAnimationStateMachine>"
  []
  CapabilityAnimation/ANIMATION_CAPABILITY)

(defn *register
  ""
  ([]
    (CapabilityAnimation/register )))

