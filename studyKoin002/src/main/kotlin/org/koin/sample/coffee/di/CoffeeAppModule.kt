package org.koin.sample.coffee.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
//import org.koin.core.annotation.Single
//import org.koin.sample.coffee.component.CoffeeMaker
//import org.koin.sample.coffee.component.ElectricHeater
//import org.koin.sample.coffee.component.Heater
//import org.koin.sample.coffee.component.Pump
//import org.koin.sample.coffee.component.Thermosiphon

/*
    CoffeeAppModule with @ComponentScan, scanning all components
 */
@Module
@ComponentScan("org.koin.sample.coffee")
class CoffeeAppModule

/*
    CoffeeAppModule without @ComponentScan, need declaration of components
 */
//@Module
//class CoffeeAppModule {
//
//    @Single
//    fun coffeeMaker(heater: Heater, pump: Pump) = CoffeeMaker(pump, heater)
//
//    @Single
//    fun pump(heater: Heater) : Pump = Thermosiphon(heater)
//
//    @Single
//    fun heater() : Heater = ElectricHeater()
//}

