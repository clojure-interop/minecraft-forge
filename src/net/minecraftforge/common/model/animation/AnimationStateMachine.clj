(ns net.minecraftforge.common.model.animation.AnimationStateMachine
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation AnimationStateMachine]))

(defn ->animation-state-machine
  "Constructor.

  parameters - `com.google.common.collect.ImmutableMap`
  clips - `com.google.common.collect.ImmutableMap`
  states - `com.google.common.collect.ImmutableList`
  transitions - `com.google.common.collect.ImmutableMultimap`
  start-state - `java.lang.String`"
  (^AnimationStateMachine [^com.google.common.collect.ImmutableMap parameters ^com.google.common.collect.ImmutableMap clips ^com.google.common.collect.ImmutableList states ^com.google.common.collect.ImmutableMultimap transitions ^java.lang.String start-state]
    (new AnimationStateMachine parameters clips states transitions start-state)))

(defn *load
  "Load a new instance if AnimationStateMachine at specified location, with specified custom parameters.

  manager - `net.minecraft.client.resources.IResourceManager`
  location - `net.minecraft.util.ResourceLocation`
  custom-parameters - `com.google.common.collect.ImmutableMap`

  returns: `net.minecraftforge.common.model.animation.IAnimationStateMachine`"
  (^net.minecraftforge.common.model.animation.IAnimationStateMachine [^net.minecraft.client.resources.IResourceManager manager ^net.minecraft.util.ResourceLocation location ^com.google.common.collect.ImmutableMap custom-parameters]
    (AnimationStateMachine/load manager location custom-parameters)))

(defn *get-missing
  "returns: `net.minecraftforge.common.model.animation.AnimationStateMachine`"
  (^net.minecraftforge.common.model.animation.AnimationStateMachine []
    (AnimationStateMachine/getMissing )))

(defn apply
  "Description copied from interface: IAnimationStateMachine

  time - `float`

  returns: `org.apache.commons.lang3.tuple.Pair<net.minecraftforge.common.model.IModelState,java.lang.Iterable<net.minecraftforge.common.animation.Event>>`"
  (^org.apache.commons.lang3.tuple.Pair [^AnimationStateMachine this ^Float time]
    (-> this (.apply time))))

(defn transition
  "Description copied from interface: IAnimationStateMachine

  new-state - `java.lang.String`"
  ([^AnimationStateMachine this ^java.lang.String new-state]
    (-> this (.transition new-state))))

(defn current-state
  "Description copied from interface: IAnimationStateMachine

  returns: `java.lang.String`"
  (^java.lang.String [^AnimationStateMachine this]
    (-> this (.currentState))))

(defn should-handle-special-events
  "Description copied from interface: IAnimationStateMachine

  value - `boolean`"
  ([^AnimationStateMachine this ^Boolean value]
    (-> this (.shouldHandleSpecialEvents value))))

