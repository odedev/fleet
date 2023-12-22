<?php

namespace App\Observers;

use App\Models\AppModule;

class AppModuleObserver
{
    /**
     * Handle the AppModule "created" event.
     */
    public function created(AppModule $appModule): void
    {
        //
    }

    /**
     * Handle the AppModule "updated" event.
     */
    public function updated(AppModule $appModule): void
    {
        //
    }

    /**
     * Handle the AppModule "deleted" event.
     */
    public function deleted(AppModule $appModule): void
    {
        //
    }

    /**
     * Handle the AppModule "restored" event.
     */
    public function restored(AppModule $appModule): void
    {
        //
    }

    /**
     * Handle the AppModule "force deleted" event.
     */
    public function forceDeleted(AppModule $appModule): void
    {
        //
    }
}
