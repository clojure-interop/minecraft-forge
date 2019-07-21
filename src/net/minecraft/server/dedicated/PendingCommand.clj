(ns net.minecraft.server.dedicated.PendingCommand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.dedicated PendingCommand]))

(defn ->pending-command
  "Constructor.

  input - `java.lang.String`
  sender - `net.minecraft.command.ICommandSender`"
  (^PendingCommand [^java.lang.String input ^net.minecraft.command.ICommandSender sender]
    (new PendingCommand input sender)))

(defn command
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^PendingCommand this]
    (-> this .-command)))

(defn sender
  "Instance Constant.

  type: net.minecraft.command.ICommandSender"
  (^net.minecraft.command.ICommandSender [^PendingCommand this]
    (-> this .-sender)))

