<?php

namespace App\Observers;

use App\Models\Enumeration;

class EnumerationObserver
{
    /**
     * Handle the Enumeration "created" event.
     */
    public function created(Enumeration $enumeration): void
    {
        //
    }

    /**
     * Handle the Enumeration "updated" event.
     */
    public function updated(Enumeration $enumeration): void
    {
        //
    }

    /**
     * Handle the Enumeration "deleted" event.
     */
    public function deleted(Enumeration $enumeration): void
    {
        //
    }

    /**
     * Handle the Enumeration "restored" event.
     */
    public function restored(Enumeration $enumeration): void
    {
        //
    }

    /**
     * Handle the Enumeration "force deleted" event.
     */
    public function forceDeleted(Enumeration $enumeration): void
    {
        //
    }
}
