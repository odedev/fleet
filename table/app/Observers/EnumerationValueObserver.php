<?php

namespace App\Observers;

use App\Models\EnumerationValue;

class EnumerationValueObserver
{
    /**
     * Handle the EnumerationValue "created" event.
     */
    public function created(EnumerationValue $enumerationValue): void
    {
        //
    }

    /**
     * Handle the EnumerationValue "updated" event.
     */
    public function updated(EnumerationValue $enumerationValue): void
    {
        //
    }

    /**
     * Handle the EnumerationValue "deleted" event.
     */
    public function deleted(EnumerationValue $enumerationValue): void
    {
        //
    }

    /**
     * Handle the EnumerationValue "restored" event.
     */
    public function restored(EnumerationValue $enumerationValue): void
    {
        //
    }

    /**
     * Handle the EnumerationValue "force deleted" event.
     */
    public function forceDeleted(EnumerationValue $enumerationValue): void
    {
        //
    }
}
